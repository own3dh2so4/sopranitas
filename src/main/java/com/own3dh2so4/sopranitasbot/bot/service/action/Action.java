package com.own3dh2so4.sopranitasbot.bot.service.action;

import com.own3dh2so4.sopranitasbot.model.action.ActionResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.Update;

public interface Action {

	public ActionResponse response(Update update);
}
