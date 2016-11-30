<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="header2.jsp"%>
	
</head>
<body>


   

	<div class="container">
    <div class="inner">
        <h1>CREATE AN ACCOUNT HERE</h1>
       
        
        <form  role="form" method="post" action="./welcome">
          
           <i><p>PERSONAL INFORMATION</p></i>
			<div class="form-group">
                    <input type="text" id="Name" name="name" required="required" placeholder="NAME" class="form-control">
                </div>
                
               <!--  <div class="form-group">
                    <input type="text" id="username" name="username" required="required" placeholder="USERNAME" class="form-control">
                </div> -->
				<!-- <div class="form-group">
                    <input type="age" id="age" name="age" required="required" placeholder="AGE" class="form-control">
                </div>
				<div class="form-group">
                    <input type="text" id="place" name="text" required="required" placeholder="PLACE" class="form-control">
                </div> -->
				<div class="form-group">
                    <input type="email" id="email" name="email" required="@" placeholder="E-MAIL" class="form-control">
                </div>
              <!--   <div class="form-group">
                    <input type="" id="mob-no" name="mob-no" required="required" placeholder="MOBILE-NO" class="form-control">
                </div> -->
				<i><p>LOGIN INFORMATION</p></i>
                <div class="form-group">
                    <input type="password" id="password" name="password" required="required" placeholder="Password" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" id="password" name="password1" required="required" placeholder="Password (Confirm)" class="form-control">
                </div>
                  <p style="color:red;">${error}
                <div class="form-group">
              
                    <button type="submit" class="button">Create An Account</button>
                </div>
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