package com.own3dh2so4.sopranitasbot.bot.service.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.own3dh2so4.sopranitasbot.model.action.ActionResponse;
import com.own3dh2so4.sopranitasbot.model.action.StickerResponse;
import com.own3dh2so4.sopranitasbot.model.action.TextResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.Message;

public class DavidAction extends ActionBase {

	public static List<ActionResponse> authorizedResponses = new ArrayList<ActionResponse>();

	public static List<ActionResponse> unAuthorizedResponses = new ArrayList<ActionResponse>();

	static {
		authorizedResponses.add(new TextResponse("Holiiiii"));
		authorizedResponses.add(new TextResponse("A pastar"));
		authorizedResponses.add(new TextResponse("Shits happens"));
		authorizedResponses.add(new StickerResponse("BQADBAADqAEAAvlsRwKPPMcqCbklWQI"));
		authorizedResponses.add(new StickerResponse("BQADBQADrwADGWLvAAEZSW0U6sM84AI"));

		unAuthorizedResponses.add(new StickerResponse("BQADBAADUAEAAvlsRwI9OJLIQJdsdQI"));
		unAuthorizedResponses.add(new StickerResponse("BQADBAAD6AAD-WxHAjQNZuMJvdjZAg"));
	}

	@Override
	public boolean isMessageValid(Message message) {
		return message.getText() != null && message.getText().contains("/david");
	}

	private boolean isUserAuthorized(Message message) {
		String userAlias = message.getFrom().getUsername();

		return userAlias != null && (userAlias.equals("alitasbufalo367") || userAlias.equals("own3dh2so4"));
	}

	private ActionResponse generateRandomResponse(List<ActionResponse> list) {
		Random random = new Random();
		return list.get(random.nextInt(list.size()));
	}

	@Override
	public ActionResponse generateResponse(Message message) {
		ActionResponse response;
		if (isUserAuthorized(message)) {
			response = generateRandomResponse(authorizedResponses);
		} else {
			response = generateRandomResponse(unAuthorizedResponses);
		}
		response.setChat_id(message.getChat().getId());
		return response;
	}

}
