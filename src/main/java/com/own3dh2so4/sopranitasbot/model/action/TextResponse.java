package com.own3dh2so4.sopranitasbot.model.action;

public class TextResponse extends ActionResponse{
	
	private String text;
	
	public TextResponse( long chat_id, String text) {
		super(chat_id);
		this.text = text;
	}
	
	public TextResponse(String text) {
		super(-1L);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
