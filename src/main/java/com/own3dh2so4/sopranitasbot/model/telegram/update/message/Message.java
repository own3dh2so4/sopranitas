package com.own3dh2so4.sopranitasbot.model.telegram.update.message;

import java.util.List;

import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.Audio;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.Contact;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.Document;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.Location;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.PhotoSize;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.Sticker;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.Video;
import com.own3dh2so4.sopranitasbot.model.telegram.update.message.multimedia.Voice;

public class Message {

	private long message_id;

	private User from;
	
	private long date;

	private Chat chat;
	
	private Chat forward_from;
	
	private int forward_date;

	private Message reply_to_message;
	
	private String text;
	
	private Audio audio;
	
	private Document document;
	
	private List<PhotoSize> photo;
	
	private Sticker sticker;
	
	private Video video;
	
	private Voice voice;
	
	private String caption;
	
	private Contact contact;
	
	private Location location;
	
	private User new_chat_participant;
	
	private User left_chat_participant;
	
	private String new_chat_title;
	
	private List<PhotoSize> new_chat_photo;
	
	private int migrate_to_chat_id;
	
	private int migrate_from_chat_id;

	public long getMessage_id() {
		return message_id;
	}

	public void setMessage_id(long message_id) {
		this.message_id = message_id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public Chat getForward_from() {
		return forward_from;
	}

	public void setForward_from(Chat forward_from) {
		this.forward_from = forward_from;
	}

	public int getForward_date() {
		return forward_date;
	}

	public void setForward_date(int forward_date) {
		this.forward_date = forward_date;
	}

	public Message getReply_to_message() {
		return reply_to_message;
	}

	public void setReply_to_message(Message reply_to_message) {
		this.reply_to_message = reply_to_message;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public List<PhotoSize> getPhoto() {
		return photo;
	}

	public void setPhoto(List<PhotoSize> photo) {
		this.photo = photo;
	}

	public Sticker getSticker() {
		return sticker;
	}

	public void setSticker(Sticker sticker) {
		this.sticker = sticker;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public User getNew_chat_participant() {
		return new_chat_participant;
	}

	public void setNew_chat_participant(User new_chat_participant) {
		this.new_chat_participant = new_chat_participant;
	}

	public User getLeft_chat_participant() {
		return left_chat_participant;
	}

	public void setLeft_chat_participant(User left_chat_participant) {
		this.left_chat_participant = left_chat_participant;
	}

	public String getNew_chat_title() {
		return new_chat_title;
	}

	public void setNew_chat_title(String new_chat_title) {
		this.new_chat_title = new_chat_title;
	}

	public List<PhotoSize> getNew_chat_photo() {
		return new_chat_photo;
	}

	public void setNew_chat_photo(List<PhotoSize> new_chat_photo) {
		this.new_chat_photo = new_chat_photo;
	}

	public int getMigrate_to_chat_id() {
		return migrate_to_chat_id;
	}

	public void setMigrate_to_chat_id(int migrate_to_chat_id) {
		this.migrate_to_chat_id = migrate_to_chat_id;
	}

	public int getMigrate_from_chat_id() {
		return migrate_from_chat_id;
	}

	public void setMigrate_from_chat_id(int migrate_from_chat_id) {
		this.migrate_from_chat_id = migrate_from_chat_id;
	}	
}
