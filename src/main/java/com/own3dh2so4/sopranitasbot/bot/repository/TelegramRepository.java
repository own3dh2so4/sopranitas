package com.own3dh2so4.sopranitasbot.bot.repository;

import java.util.List;

import com.own3dh2so4.sopranitasbot.model.action.StickerResponse;
import com.own3dh2so4.sopranitasbot.model.action.TextResponse;
import com.own3dh2so4.sopranitasbot.model.telegram.update.Update;

public interface TelegramRepository {

	public List<Update> getNewMessages();
	
	public void sendTextMessage(TextResponse textResponse);
	
	public void sendStickerMessage(StickerResponse stickerMessage );
}
