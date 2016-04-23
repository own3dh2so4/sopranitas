package com.own3dh2so4.sopranitasbot.model.action;

public abstract class ActionResponse {

	protected long chat_id;
	
	public ActionResponse(long chat_id) {
		this.chat_id = chat_id;
	}

	public long getChat_id() {
		return chat_id;
	}

	public void setChat_id(long chat_id) {
		this.chat_id = chat_id;
	}
	
}
