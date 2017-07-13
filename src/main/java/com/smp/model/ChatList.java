package com.smp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ChatList {

	@Id
	private String chatList_Id;
	private String chatNames;
	private int messageCount;
	public String getChatList_Id() {
		return chatList_Id;
	}
	public String getChatNames() {
		return chatNames;
	}
	public int getMessageCount() {
		return messageCount;
	}
	public void setChatList_Id(String chatList_Id) {
		this.chatList_Id = chatList_Id;
	}
	public void setChatNames(String chatNames) {
		this.chatNames = chatNames;
	}
	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}
	
	
}
