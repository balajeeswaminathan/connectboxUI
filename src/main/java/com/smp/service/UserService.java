package com.smp.service;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.smp.model.User;
import com.smp.model.Users;
import com.smp.model.Chat;

@Repository
public class UserService {	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public static final String COLLECTION_NAME = "user";
	public static final String COLLECTION_NAMEUSER = "users";
	public static final String COLLECTION_NAMECHAT = "chat";
	
	public void addUser(User user) {
		System.out.println("class: "+User.class);
		if (!mongoTemplate.collectionExists(User.class)) {
			System.out.println("exissttt");
			mongoTemplate.createCollection(User.class);
		}		
		user.setUser_Id(UUID.randomUUID().toString());
		mongoTemplate.insert(user, COLLECTION_NAME);
	}
	
	public void addUsers(Users users) {
		users.setUser_Id(UUID.randomUUID().toString());
		mongoTemplate.insert(users, COLLECTION_NAMEUSER);
	}
	
	public void addChat(Chat chat) {
		chat.setChat_Id(UUID.randomUUID().toString());
		mongoTemplate.insert(chat, COLLECTION_NAMECHAT);
	}
	
	public List<User> listUser() {
		return mongoTemplate.findAll(User.class, COLLECTION_NAME);
	}
	
	public List<Chat> listChat() {
		return mongoTemplate.findAll(Chat.class, COLLECTION_NAMECHAT);
	}
	
	public void deleteUser(User user) {
		mongoTemplate.remove(user, COLLECTION_NAME);
	}
	
	public void updateUser(User user) {
		mongoTemplate.insert(user, COLLECTION_NAME);		
	}

}
