<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="header1.jsp" %>
  
</head>
<body>
   
  <div>
  <img src="<c:url value='resources/images/back.jpg'/>"/>
  </div>
  
   <%@include file="footer.jsp" %>

    <script src="<c:url value='resources/js/jquery.js'/>"/></script>
    <script src="<c:url value='resources/js/bootstrap.min.js'/>"/></script>
    <script src="<c:url value='resources/js/jquery.prettyPhoto.js'/>"/></script>
    <script src="<c:url value='resources/js/main.js'/>"/></script>
</body>
</html>