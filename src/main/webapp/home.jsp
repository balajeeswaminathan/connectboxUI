<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width" />
    <title>connecting Us</title>

    <link href="//localhost/chatClient/css/unite-gallery.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/header.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/chat.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/menu.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/home.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/feed.css" rel="stylesheet">
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/2.0.0/handlebars.js"></script>
    <script src="//localhost/chatClient/js/plugins/unitegallery.js"></script>
    <script src="//localhost/chatClient/js/plugins/ug-theme-tiles.js"></script>
    <script src="//localhost/chatClient/js/Utils/utils.js"></script>
    <script src="//localhost/chatClient/js/headerAndMenu.js"></script>
    <script src="//localhost/chatClient/js/chat.js"></script>
    <script src="//localhost/chatClient/js/home.js"></script>
    <script src="//localhost/chatClient/js/feed.js"></script>
</head>
<body class="connUs-home">
    <%@ include file="/WEB-INF/views/header.jsp" %>
    <%@ include file="/WEB-INF/views/menu.jsp" %>
    <div class="connUs-page-outerWrapper">
	    <div id="connUs-page-wrapper">
		<%@ include file="/WEB-INF/views/feed.jsp" %>
	    <%@ include file="/WEB-INF/views/feedListHb.jsp" %>
	    <%@ include file="/WEB-INF/views/likeListHb.jsp" %>
	    <%@ include file="/WEB-INF/views/cmntsListHb.jsp" %>
	
	    <div class="connUs-chatsListhb">
	        <%@ include file="/WEB-INF/views/chatsList.jsp" %>
	    </div>
	    
	    <div class="connUs-chatsListMgsthb">
	        <%@ include file="/WEB-INF/views/chatsListMgs.jsp" %>
	    </div>
	    
	   <div class="connUs-friends-wrapper"></div>
	   <div class="connUs-chats-wrapper"></div>
	</div>
    <%@ include file="/WEB-INF/views/chat.jsp" %>
</body>
</html>