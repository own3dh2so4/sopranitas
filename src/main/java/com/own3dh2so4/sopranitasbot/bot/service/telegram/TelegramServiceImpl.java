package com.own3dh2so4.sopranitasbot.bot.service.telegram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.own3dh2so4.sopranitasbot.bot.repository.TelegramRepository;
import com.own3dh2so4.sopranitasbot.model.action.ActionResponse;
import com.own3dh2so4.sopranitasbot.model.action.StickerResponse;
import com.own3dh2so4.sopranitasbot.model.action.TextResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.Update;

@Service
public class TelegramServiceImpl implements TelegramService{

	@Autowired
	private TelegramRepository telegramRepository;
	
	
	
	public List<Update> getNewMessages() {
		return telegramRepository.getNewMessages();
	}



	public void sendMessage(ActionResponse action) {
		if (action instanceof TextResponse) {
			telegramRepository.sendTextMessage((TextResponse) action);
		} else if ( action instanceof StickerResponse) {
			telegramRepository.sendStickerMessage((StickerResponse) action);
		}
		
	}

}
