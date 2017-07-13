package com.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.mongodb.DBObject;
import com.smp.model.Chat;
import com.smp.model.User;
import com.smp.service.chatService;


@Controller
public class ChatController {
	
	@Autowired
	private chatService chatService;
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public String login(@ModelAttribute User user, ModelMap model) {
		DBObject userE = chatService.userExist(user.getEmail(),user.getPassword());
    	if(userE != null)
    	{
    		return "home";
    	}
    	else
    	{
    		return "/";
    	}
    }
	
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public String register(@ModelAttribute User user, ModelMap model) {
    		chatService.addUser(user);
    		chatService.createCollection(user.getUsername()+"_FriendsList");
    		chatService.createCollection(user.getUsername()+"_ChatList");
    	return "home";
    }
	
	@RequestMapping(value = "/user/search", method = RequestMethod.GET)
	public String searchUser(@ModelAttribute User user, ModelMap model) {
    	model.addAttribute("searchList", chatService.searchUser(user.getUsername()));
    	return "home";
    }
	
	@RequestMapping(value = "/user/requestFriends", method = RequestMethod.GET)
	public String requestFriends(@ModelAttribute User accepter, ModelMap model) {
		User requester = new User();
		requester.setUsername("test");
		chatService.addFriends(requester.getUsername()+"_FriendsList",accepter.getUsername(),-1);
		chatService.addFriends(accepter.getUsername()+"_FriendsList",requester.getUsername(),1);
    	return "home";
    }
	
	@RequestMapping(value = "/user/acceptFriends", method = RequestMethod.GET)
	public String acceptFriends(@ModelAttribute User accepter, @ModelAttribute User requester, ModelMap model) {
		chatService.addFriends(accepter.getUsername()+"_FriendsList",requester.getUsername(),0);
		chatService.addFriends(requester.getUsername()+"_FriendsList",accepter.getUsername(),0);
    	return "home";
    }
	
	@RequestMapping(value = "/user/friendList", method = RequestMethod.GET)
	public String friendList(ModelMap model) {
		User requester = new User();
		requester.setUsername("test");
    	model.addAttribute("friendsList", chatService.friendsList(requester.getUsername()+"_FriendsList"));
    	return "home";
    }
	
	@RequestMapping(value = "/user/addChat", method = RequestMethod.GET)
	public String addChat(@ModelAttribute Chat chat,ModelMap model) {
		chatService.addChatList(chat.getSender()+"_ChatList",chat.getReceiver(),1);
		chatService.addChatList(chat.getReceiver()+"_ChatList",chat.getSender(),1);
		chatService.addChat(chat);
		return "home";
    }
}