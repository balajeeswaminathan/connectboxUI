<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>connecting Us</title>
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/2.0.0/handlebars.js"></script>
    <script src="//localhost/chatClient/js/home.js"></script>
    <script src="//localhost/chatClient/js/chat.js"></script>
    <script src="//localhost/chatClient/js/topics.js"></script>
    
    <link href="//localhost/chatClient/css/header.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/topics.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/chat.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/home.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/friendsList.css" rel="stylesheet">
</head>
<body>
    <%@ include file="/WEB-INF/views/header.jsp" %>
    
    <div class="connUs-basicInfo">
        <div class="connUs-profile-img">
            <img class="connUs-profile-img" src="//localhost/chatClient/img/photo.jpg"/>
        </div>
        <div class="connUs-profile-name"></div>
    </div>
    <div class="connUs-menu-cont">
        <div class="connUs-menu connUs-profile">Profile</div>
        <div class="connUs-menu connUs-friends">Friends</div>
        <div class="connUs-menu connUs-photos">Photos</div>
        <div class="connUs-menu connUs-msg">messages</div>
        <div class="connUs-menu connUs-msg">Topics</div>
    </div>
    
    <div class="connUs-topicsMenu-cont">
        <div class="connUs-topicsMenu-member" topicType="member">Connected</div>
        <div class="connUs-topicsMenu-liked" topicType="liked">Liked</div>
        <div class="connUs-topicsMenu-owner" topicType="owner">Yours</div>
    </div>
    
    <div class="connUs-addTopics-cont">
        <input type="text" class="connUs-addTopics-name" placeholder="Add your topics name"/>
        <form id="connUs-addTopics-img">
            <input id="connUs-topics-imgUpload" type="file" name="file" />
        </form>
        <div class="connUs-addTopicsImgDisplayCont">
            <img class="connUs-addTopicsImgDisplay"/>
        </div>
        <div class="connUs-addTopics-btn">Add</div>
    </div>
    
    <div class="connUs-topic-member-wrapper"></div>
    <div class="connUs-topic-liked-wrapper"></div>
    <div class="connUs-topic-owner-wrapper"></div>
    
    <div class="connUs-chatsListhb">
        <%@ include file="/WEB-INF/views/chatsList.jsp" %>
    </div>
    
    <div class="connUs-chatsListMgsthb">
        <%@ include file="/WEB-INF/views/chatsListMgs.jsp" %>
    </div>
    
   <div class="connUs-friends-wrapper"></div>
   <div class="connUs-chats-wrapper"></div>

    <%@ include file="/WEB-INF/views/topicsListHb.jsp" %>
    <%@ include file="/WEB-INF/views/chat.jsp" %>
</body>
</html>