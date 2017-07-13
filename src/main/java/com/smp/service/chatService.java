package com.smp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.smp.model.Chat;
import com.smp.model.ChatList;
import com.smp.model.FriendsList;
import com.smp.model.User;

@Repository
public class chatService {

	@Autowired
	private MongoTemplate mongoTemplate;
	MongoOperations mongoOperations; 

	public static final String COLLECTION_USER = "user", COLLECTION_CHAT = "chat";

	public DBObject userExist(String email, String password) {
		DBCollection collection = mongoTemplate.getCollection(COLLECTION_USER);
		BasicDBObject andQuery = new BasicDBObject();
		List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
		obj.add(new BasicDBObject("email", email));
		obj.add(new BasicDBObject("password", password));
		andQuery.put("$and", obj);
		BasicDBObject fields = new BasicDBObject();
		fields.put("email", 1);
		DBCursor resultSet = collection.find(andQuery, fields);
		if (resultSet.hasNext()) {
			return resultSet.next();
		} else {
			return null;
		}
	}

	public void addUser(User user) {
		user.setUser_Id(UUID.randomUUID().toString());
		mongoTemplate.insert(user, COLLECTION_USER);
	}

	public List<User> searchUser(String userName) {
		return mongoTemplate.findAll(User.class, COLLECTION_USER);
	}

	public void createCollection(String collName)
	{
		mongoTemplate.createCollection(collName);
	}
	
	public void addFriends(String friendsCollName, String friendsName, int status) {
		if(status != 0)
		{
			FriendsList fl = new FriendsList();
			fl.setFriend_Id(UUID.randomUUID().toString());
			fl.setFriendsName(friendsName);
			fl.setStatus(status);
			mongoTemplate.insert(fl,friendsCollName);
		}
		else
		{
			mongoOperations.updateFirst(  
					  new Query(Criteria.where("friendsName").is(friendsName)),  
					  Update.update("status", status),friendsCollName);    
		}
	}

	public void addChatList(String chatListCollName, String chatNames, int messageCount) {
		ChatList chat = new ChatList();
		chat.setChatNames(chatNames);
		chat.setMessageCount(messageCount);
		mongoTemplate.insert(chat, chatListCollName);
	}
	
	public void addChat(Chat chat){
		chat.setChat_Id(UUID.randomUUID().toString());
		mongoTemplate.insert(chat, COLLECTION_CHAT);
	}

	public Object friendsList(String collName) {
		return mongoTemplate.findAll(FriendsList.class, collName);
	}
}
