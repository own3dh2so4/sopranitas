package com.own3dh2so4.sopranitasbot.bot.repository.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Environment {

	@Value("${telegram.url.base}${telegram.url.update}")
	public String URL_GET_MESSAGES = "";
	
	@Value("${telegram.url.base}${telegram.url.sendMessage}")
	public String URL_SEND_TEXT_MESSAGE = "";
	
	@Value("${telegram.url.base}${telegram.url.sendSticker}")
	public String URL_SEND_STICKER_MESSAGE = "";
	
	@Value("${telegram.bot.token}")
	public String BOT_TOKEN = "";
}
