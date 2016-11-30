<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<%@include file="header1.jsp" %>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<style>.table-sortable tbody tr {
    cursor: move;
}
</style>
</head>
<body>
<div class="container">
    <div class="row clearfix">
    	<div class="col-md-12 table-responsive">
    	
    	
    	<h3>NAME(posted by) : ${b.name}</h3>
    	
    	<br>
    	<hr>
    	<h3>QUESTION :</h3>
    	<h4>${b.question}</h4>
    	<br>
    	<hr>
    	<h3>CONTENT :</h3>
    	<h4>${b.forumContent }</h4>
    	<br>
    	<hr>
    	<h3>DATE(posted on) :${b.creationDate}</h3>
    	<hr>
    <%-- 	
    	 <div class="container">
         <div class="inner">
       <form:form commandName="ans" action="./addReply?id=${b.forumId}" method="post">
									<form:hidden path="forumid" value="${b.forumId}"/>
									 <form:input path="answer" placeholder="comment"/>
									 <form:input path="userid" placeholder="UserName"/><br>
									 <input type="submit" value="Comment"> 
									 </form:form>
									  --%>
									 
									 
									  <div class="row">
                        <div class="col-sm-7">
                         <form:form commandName="ans" action="./addReply?id=${b.forumId}" method="post">
                        <form:hidden path="forumid" value="${b.forumId}"/>
                            <div class="form-group">
                             <form:input type="text" path="answer" placeholder="Comment"  class="form-control input-md"/>
                            </div>
                           
                            <div class="form-group">
                            <form:input type="text" path="userid"  placeholder="UserName" class="form-control input-md"/>
                            </div>
								<input type="submit" value="Comment"> 
								</form:form>	 
											
								<c:forEach items="${cmts}" var="b">
									<p>${b.userid}<br>
									${b.answer}</p>
									</c:forEach>
									  
		</div>
	</div>
  
			
		</div>
	</div>
	
</div>
<%@include file="footer.jsp" %>



</body>
</html>