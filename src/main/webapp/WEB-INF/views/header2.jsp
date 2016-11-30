<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>LIVE CHAT</title>
    <link href="<c:url value='resources/css/bootstrap.min.css" rel="stylesheet'/>"/>
    <link href="<c:url value='resources/css/font-awesome.min.css" rel="stylesheet'/>"/>
    <link href="<c:url value='resources/css/prettyPhoto.css" rel="stylesheet'/>"/>
    <link href="<c:url value='resources/css/animate.css" rel="stylesheet'/>"/>
    <link href="<c:url value='resources/css/main.css" rel="stylesheet'/>"/>
        
  

<style>

.control-label{float: left;}
.container .inner{width: 480px; margin: 100px auto; border : 1px solid none; background: rgba(55,55,55, 0.4); padding: 10px; -webkit-transform: skew(30deg,10deg);-moz-transform: skew(30deg,10deg); -o-transform: skew(30deg,10deg); transition-duration: 0.7s;}
.container .inner:hover{-webkit-transform:skew(0deg,0deg); -moz-transform:skew(0deg,0deg);-o-transform:skew(0deg,0deg);transition-duration: 0.7s; background: transparent;}
.inner h1{color : rgb(200,200,200); font-family: calibri, arial; font-weight: bold; text-align: center; font-size: 40px}
.inner h3{color: rgb(200,200,200); font-size: 18px; font-family: calibri; text-align: center; margin-top: -5px}
.inner form label span{color: white;}
.inner form lagend{color: white;}
.inner .input{width : 90%; border: none; border-bottom: 1px solid white; color: #9f00a7; background: transparent; padding: 10px;}
.inner .input:focus{box-shadow: none; border: 1px solid none;}
.container hr{border-color: rgb(100,100,100);}
.inner .button{border-radius:10px 10px 10px 10px;color: #9f00a7; background: rgba(50,50,50, 0.4); padding: 2px 30px ;  border: 2px solid #9f00a7;  font-family: calibri; margin:10px auto; font-weight: bold;}
.inner .button:hover{background: #8f00a7; color: white;}


body {
    background-image: url("<c:url value='resources/images/login.jpg'/>");
	background-size: 100% 100%;
}
</style>	
</head>
<body>
 <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home"><img src="<c:url value='resources/images/images.png" alt="logo'/>"/></a>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="home">HOME</a></li>
					 <li><a href="chat">CHAT</a></li>
                    <li><a href="blog">BLOG</a></li>                            
					 <li><a href="forum">FORUM</a></li>
					  <li><a href="login">SIGN IN</a></li>
                     <li><a href="Register">SIGN UP</a></li>
					 <li><a href="about-us">ABOUT US</a></li>		 
                
                    		 
                </ul>
            </div>
        </div>
    </header>
</body>
</html>