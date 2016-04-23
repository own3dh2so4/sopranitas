package com.own3dh2so4.sopranitasbot.bot.service.action;

import com.own3dh2so4.sopranitasbot.model.action.ActionResponse;
import com.own3dh2so4.sopranitasbot.model.action.NoResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.Update;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.Message;

public abstract class ActionBase implements Action{

	public ActionResponse response(Update update) {
		ActionResponse response = new NoResponse();
		
		Message message = update.getMessage();
		
		if (isMessageValid(message)) {
			response = generateResponse(message);
		}
		
		return response;
	}

	public abstract ActionResponse generateResponse(Message message);

	public abstract boolean isMessageValid(Message message);

}
