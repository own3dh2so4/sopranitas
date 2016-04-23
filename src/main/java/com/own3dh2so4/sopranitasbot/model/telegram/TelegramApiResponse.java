package com.own3dh2so4.sopranitasbot.model.telegram;

public class TelegramApiResponse<T> {
	
	private boolean ok;
	
	private T result;

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	

}
