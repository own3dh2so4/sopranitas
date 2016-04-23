package com.own3dh2so4.sopranitasbot.bot.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.own3dh2so4.sopranitasbot.bot.repository.environment.Environment;
import com.own3dh2so4.sopranitasbot.model.action.StickerResponse;
import com.own3dh2so4.sopranitasbot.model.action.TextResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.TelegramApiResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.Update;

@Repository
public class TelegramRepositoryImpl implements TelegramRepository {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private Environment env;

	private long offset = 0;

	public List<Update> getNewMessages() {
		Map<String, String> params = createMapParam();
		params.put("offset", String.valueOf(offset));

		TelegramApiResponse<List<Update>> response = restTemplate.getForObject(env.URL_GET_MESSAGES,
				TelegramApiResponse.class, params);

		List<Update> listMessages = getListMessages(response);

		updateOffset(listMessages);

		return listMessages;
	}

	private List<Update> getListMessages(TelegramApiResponse<List<Update>> response) {
		return objectMapper.convertValue(response.getResult(), new TypeReference<List<Update>>() {
		});

	}

	private void updateOffset(List<Update> result) {
		if ( result.size() >= 1)
			offset = result.get(result.size() - 1).getUpdate_id() + 1;

	}

	public void sendTextMessage(TextResponse textResponse) {
		Map<String, String> params = createMapParam();
		params.put("chat_id", String.valueOf(textResponse.getChat_id()));
		params.put("text", textResponse.getText());
		
		restTemplate.getForObject(env.URL_SEND_TEXT_MESSAGE, Object.class, params);		
	}
	
	public void sendStickerMessage(StickerResponse stickerMessage ) {
		Map<String, String> params = createMapParam();
		params.put("chat_id", String.valueOf(stickerMessage.getChat_id()));
		params.put("sticker", stickerMessage.getSticker());
		
		restTemplate.getForObject(env.URL_SEND_STICKER_MESSAGE, Object.class, params);
	}
	
	private Map<String, String> createMapParam() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("botToken", env.BOT_TOKEN);
		
		return params;
	}

	

}
