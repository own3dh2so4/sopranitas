package com.own3dh2so4.sopranitasbot.bot.service.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.own3dh2so4.sopranitasbot.model.action.ActionResponse;
import com.own3dh2so4.sopranitasbot.model.action.TextResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.Message;

public class GilaAction extends ActionBase {

	
	private static List<String> sentences = new ArrayList<String>();

	static {
		sentences.add("Paso");
		sentences.add("Todavia es pronto para comer");
		sentences.add("Eso ya lo habia visto yo en forocoches");
		sentences.add("Fijo, pero fijisimo vamos");
		sentences.add("Fijo, pero fijisimo");
	}

	private String generateRandomResponse() {
		Random random = new Random();
		return sentences.get(random.nextInt(sentences.size()));
	}

	@Override
	public ActionResponse generateResponse(Message message) {
		return new TextResponse(message.getChat().getId(), generateRandomResponse());
	}

	@Override
	public boolean isMessageValid(Message message) {
		return message.getText() != null && message.getText().startsWith("/gila");
	}

}
