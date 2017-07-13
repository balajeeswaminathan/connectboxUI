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
    
    <script src="//localhost/chatClient/js/plugins/unitegallery.js"></script>
    <script src="//localhost/chatClient/js/plugins/ug-theme-tiles.js"></script>
    
    <script src="//localhost/chatClient/js/photos.js"></script>
    
    <link href="//localhost/chatClient/css/header.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/chat.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/home.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/photos.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/friendsList.css" rel="stylesheet">
    <link href="//localhost/chatClient/css/unite-gallery.css" rel="stylesheet">
</head>
<body>
    <%@ include file="/WEB-INF/views/header.jsp" %>
    <%@ include file="/WEB-INF/views/menu.jsp" %>
    <div class="connUs-basicInfo">
        <div class="connUs-profile-img">
            <img class="connUs-profile-img" src="//localhost/chatClient/img/photo.jpg"/>
        </div>
        <div class="connUs-profile-name"></div>
    </div>
    <div class="connUs-ptos-OuterCont">
        <form id="connUs-addPtos-uploadCont">
            <input id="connUs-addPtos-upload" type="file" name="file" />
        </form>
        <div class="connUs-addPtos-imgCont">
            <img class="connUs-addPtos-imgDisplay"/>
            <input class="connUs-addPtos-desc" placeholder="Add description to your image"/>
        </div>
        <div class="connUs-addPtos-btn">Add Photo</div>
        <div class="connUs-ptos-wrapper"></div>
    </div>
    
    <%@ include file="/WEB-INF/views/viewPhotosHb.jsp" %>
    <%@ include file="/WEB-INF/views/likeListHb.jsp" %>
    <%@ include file="/WEB-INF/views/cmntsListHb.jsp" %>
    <%@ include file="/WEB-INF/views/chat.jsp" %>
</body>
</html>