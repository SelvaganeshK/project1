<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
   
 <center>
    <section id="contact-page" class="container">
	
        <div class="row">
            <div class="col-sm-12">
                <h2>Forum Form</h2>
                <div class="status alert alert-success" style="display: none"></div>
                 <form:form action="./forum1" commandName="frum" role="form" class="lead">
                    <div class="row">
                        <div class="col-sm-7">
                            <div class="form-group">
                               <!--  <input type="text" class="form-control" required="required" placeholder="Name"> -->
                                <form:input type="text" path="name" placeholder="Name"  class="form-control input-md"/>
                            </div>
                           
                            <div class="form-group">
                                <!-- <input type="text" class="form-control" required="required" placeholder="Title"> -->
                                <form:input type="text" path="question"  placeholder="Question" class="form-control input-md"/>
                            </div>
							<div>
                            <!-- <textarea name="message" id="message" required="required" class="form-control" rows="12" placeholder="Message"></textarea>
    -->                    <form:input cols="48" path="forumContent" placeholder="Content"  class="form-control input-md" rows="12"/>
                        </div>
                       <br>
                       
						 </div>
                    </div>
					 <div class="form-group">
                                <button type="submit" class="btn btn-primary btn-lg">Post</button>
                              <a href="forumview" class="btn btn-primary btn-lg">Forum Details</a>
                               
                            </div>
                            </form:form>
               
            </div>
            
        </div>
        	<%-- 	<div class="panel-body">
			">
	<a href="blogpage?id=${b.blogId}"><h4> ${b.blogname} </h4>
<h5>${b.blogTitle}</h5>
<p>${b.creationDate}</p></a>
</c:forEach>
</div> --%>
    </section>
	<br>

  </center>
    <%@include file="footer.jsp" %>

    <script src="<c:url value='resources/js/jquery.js'/>"/></script>
    <script src="<c:url value='resources/js/bootstrap.min.js'/>"/></script>
    <script src="<c:url value='resources/js/jquery.prettyPhoto.js'/>"/></script>
    <script src="<c:url value='resources/js/main.js'/>"/></script>
   
</body>
</html>