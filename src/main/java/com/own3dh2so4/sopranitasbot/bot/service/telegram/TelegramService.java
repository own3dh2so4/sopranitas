package com.own3dh2so4.sopranitasbot.bot.service.telegram;

import java.util.List;

import com.own3dh2so4.sopranitasbot.model.action.ActionResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.Update;

public interface TelegramService {

	public List<Update> getNewMessages();
	
	public void sendMessage( ActionResponse action);
}
