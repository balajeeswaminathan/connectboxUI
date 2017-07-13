package com.smp.controller;

import java.util.List;

import com.mongodb.DBObject;
import com.smp.model.User;
import com.smp.model.Users;
import com.smp.model.Chat;
import com.smp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
 
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)  
	public String getUserList(ModelMap model) {  
        model.addAttribute("userList", userService.listUser());
        return "output";
    }
	
	@RequestMapping(value = "/chats", method = RequestMethod.GET)  
	public String getChatList(ModelMap model) {  
        model.addAttribute("chatList", userService.listChat());
        return "chat";
    }
	
	@RequestMapping(value = "/chatss", method = RequestMethod.GET)  
	public  @ResponseBody List<Chat> getChatLists(ModelMap model) {  
        List<Chat> chat  =  (List<Chat>) userService.listChat();
        return chat;
    }
	
	@RequestMapping(value = "/chat/login", method = RequestMethod.POST)
	public View createUsers(@ModelAttribute Users users, ModelMap model) {
    	userService.addUsers(users);
    	return new RedirectView("/chat/chats");
    }
	
	@RequestMapping(value = "/chat/add", method = RequestMethod.POST)
	public View createChat(@ModelAttribute Chat chat, ModelMap model) {
    	userService.addChat(chat);
    	return new RedirectView("/chat/chats");
    }
	
    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public View createUser(@ModelAttribute User user, ModelMap model) {
    	if(StringUtils.hasText(user.getUser_Id()))
    	{
    		userService.updateUser(user);
    	}
    	else
    	{
    		userService.addUser(user);
    		System.out.println(false);
    	}
    	return new RedirectView("/chat/user");  
    }
}