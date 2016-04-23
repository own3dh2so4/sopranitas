package com.own3dh2so4.sopranitasbot.model.action;

public class StickerResponse extends ActionResponse {
	
	private String sticker;
	
	public StickerResponse (long chat_id, String sticker) {
		super(chat_id);
		this.sticker = sticker;
	}
	
	public StickerResponse(String sticker) {
		super(-1L);
		this.sticker = sticker;
	}

	public String getSticker() {
		return sticker;
	}

	public void setSticker(String sticker) {
		this.sticker = sticker;
	}
	
	

}
