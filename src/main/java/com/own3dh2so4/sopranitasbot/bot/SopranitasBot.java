package com.own3dh2so4.sopranitasbot.bot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.own3dh2so4.sopranitasbot.bot.service.action.Action;
import com.own3dh2so4.sopranitasbot.bot.service.telegram.TelegramService;
import com.own3dh2so4.sopranitasbot.model.action.ActionResponse;
import com.own3dh2so4.sopranitasbot.model.action.NoResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.Update;

@Component("SopranitasBot")
public class SopranitasBot implements Bot {

	@Autowired
	private TelegramService telegramService;

	public void startBot(List<Action> actions) {
		while (true) {
			List<Update> messages = telegramService.getNewMessages();

			for (Update message : messages) {
				ActionResponse actionResponse = new NoResponse();
				for (Action action : actions) {
					actionResponse = action.response(message);
					if (!(actionResponse instanceof NoResponse)) {
						break;
					}
				}
				telegramService.sendMessage(actionResponse);
			}			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
