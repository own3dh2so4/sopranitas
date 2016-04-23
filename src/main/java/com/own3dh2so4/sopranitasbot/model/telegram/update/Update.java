package com.own3dh2so4.sopranitasbot.model.telegram.update;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {

	private long update_id;
	
	private Message message;

	public long getUpdate_id() {
		return update_id;
	}

	public void setUpdate_id(long update_id) {
		this.update_id = update_id;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
}
