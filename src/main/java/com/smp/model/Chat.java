package com.smp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Chat {
	@Id
	private String chat_Id;
	private String sender;
	private String receiver;
	public String message;
	
	public String getChat_Id() {
		return chat_Id;
	}
	public String getSender() {
		return sender;
	}
	public String getReceiver() {
		return sender;
	}
	public String getMessage() {
		return message;
	}
	
	public void setChat_Id(String chat_Id) {
		this.chat_Id = chat_Id;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
