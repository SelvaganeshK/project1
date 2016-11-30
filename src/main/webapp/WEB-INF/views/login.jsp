<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="header2.jsp" %>
	
</head>
<body>



   
	


<div class="container">
    <div class="inner">
        <h1>WELCOME USER</h1>
       
        
        <form action="./checklogin" method="post" name="Login" id="Login-form">
           <fieldset class="input">
            <label><span class="glyphicon glyphicon-user"></span></label>
          <input type="text" id="username" name="username" required="required" placeholder="USERNAME" class="form-control"><br>
            <label><span class="glyphicon glyphicon-lock"></span></label>
             <input type="password" id="password" name="password" required="required" placeholder="PASSWORD" class="form-control"><br>
			 <p><a href="Register">New Users.? Create an account</a></p>
            <button type="submit" class="button">LOGIN</button>
            </fieldset>
        </form>
        
    </div>    
</div>

<%@include file="footer.jsp" %>

    <script src="<c:url value='resources/js/jquery.js'/>"/></script>
    <script src="<c:url value='resources/js/bootstrap.min.js'/>"/></script>
    <script src="<c:url value='resources/js/jquery.prettyPhoto.js'/>"/></script>
    <script src="<c:url value='resources/js/main.js'/>"/></script>
</body>
</html>