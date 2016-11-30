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
                <h2>Blog Form</h2>
                <div class="status alert alert-success" style="display: none"></div>
                 <form:form action="./blog1" commandName="blo" role="form" class="lead">
                    <div class="row">
                        <div class="col-sm-7">
                            <div class="form-group">
                               <!--  <input type="text" class="form-control" required="required" placeholder="Name"> -->
                                <form:input type="text" path="blogname" placeholder="Name"  class="form-control input-md"/>
                            </div>
                           
                            <div class="form-group">
                                <!-- <input type="text" class="form-control" required="required" placeholder="Title"> -->
                                <form:input type="text" path="blogTitle"  placeholder="Title" class="form-control input-md"/>
                            </div>
							<div>
                            <!-- <textarea name="message" id="message" required="required" class="form-control" rows="12" placeholder="Message"></textarea>
    -->                    <form:input cols="48" path="blogContent" placeholder="BlogContent"  class="form-control input-md" rows="12"/>
                        </div>
                       <br>
                        <div class="form-group">
                               <!--  <input type="text" class="form-control" required="required" placeholder="Title"> -->
                                <form:input type="text" path="blogtag"  placeholder="Tag" class="form-control input-md"/>
                            </div>
						 </div>
                    </div>
					 <div class="form-group">
                                <button type="submit" class="btn btn-primary btn-lg">Post Message</button>
                              <a href="blogview" class="btn btn-primary btn-lg">Blog Details</a>
                               
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
<%-- <div class="container" ng-app="myapp" ng-controller="BlogController">
<p>Search your blog here:</p>

<p><input type="text" class="form-control" placeholder="Search...." ng-model="test"></p>
<div class="container">
    <div class="row clearfix">
    	<div class="col-md-8 table-responsive">
			<table class="table table-bordered table-hover table-sortable" id="tab_logic">
				<thead>
					<tr >
						<th class="text-center">Name</th>
						
						<th class="text-center">Title</th>
						
                        <th class="text-center"> Date</th>
                        
                        <th class="text-center">Details</th>
                        
                        </tr>
                </thead>
                
         <tbody>
              <c:forEach var="b"  items="${blogList}">                        
                   <tr>
                   <tr ng-repeat="b in aa | filter:test">
						<td> {{b.blogname}}</td>
						<td>{{b.blogTitle}}</td>
						<td>{{b.creationDate}}</td>
						<td><a href="blogpage?id={{b.blogId}}">view details</a></td>
                   </tr>
                        </c:forEach>
  </tbody>
  </table>
  </div>
  </div>
  </div> --%>
  </center>
    <%@include file="footer.jsp" %>

    <script src="<c:url value='resources/js/jquery.js'/>"/></script>
    <script src="<c:url value='resources/js/bootstrap.min.js'/>"/></script>
    <script src="<c:url value='resources/js/jquery.prettyPhoto.js'/>"/></script>
    <script src="<c:url value='resources/js/main.js'/>"/></script>
   
</body>
</html>