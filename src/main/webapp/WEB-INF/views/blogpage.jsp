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
    	
    	<h3>NAME(posted by) : ${b.blogname}</h3>
    	
    	
    	<br>
    	<hr>
    	<h3>TITLE :${b.blogTitle}</h3>
    	
    	<br>
    	<hr>
    	<h3>MESSAGE :</h3>
    	<h4>${b.blogContent }</h4>
    	<br>
    	<hr>
    	<h3>TAG :${b.blogtag }</h3>
    	
    	<br>
    	<hr>
    	<h3>DATE(posted on) :${b.creationDate}</h3>
    	
    	<hr>
   <%--  <div class="container">
    <div class="inner">
       <form:form commandName="cmt" action="./addComment?id=${b.blogId}" method="post">
									<form:hidden path="blogid" value="${b.blogId}"/>
									 <form:input path="cmtcontent" placeholder="comment"/>
									 <form:input path="userid" placeholder="UserName"/><br>
									 <input type="submit" value="Comment"> 
									 </form:form>
									 --%>
									
									
					    <div class="row">
                        <div class="col-sm-7">
                         <form:form commandName="cmt" action="./addComment?id=${b.blogId}" method="post">
                        <form:hidden path="blogid" value="${b.blogId}"/>
                            <div class="form-group">
                              
                                <form:input type="text" path="cmtcontent" placeholder="Comment"  class="form-control input-md"/>
                            </div>
                           
                            <div class="form-group">
                              
                                <form:input type="text" path="userid"  placeholder="USerName" class="form-control input-md"/>
                            </div>
								 <input type="submit" value="Comment"> 	
								</form:form>
									
									
									
									
									
								<c:forEach items="${cmts}" var="cmt">
									<p>${cmt.userid}<br>
									${cmt.cmtcontent}</p>
									</c:forEach>
									  
		</div>
	</div>
	</div>
</div>
</div><br><br><br><br>
<%@include file="footer.jsp" %>



</body>
</html>