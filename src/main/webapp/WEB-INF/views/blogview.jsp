<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LIVE CHAT</title>
<%@include file="header1.jsp" %>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script>
var c=${selva};
   angular.module('myapp',[]).controller('BlogController',function($scope)
   {
	 
	   $scope.aa=c;
	   
   });
</script>
<style>.table-sortable tbody tr {
    cursor: move;
}
</style>


</head>
<body>
<div class="container" ng-app="myapp" ng-controller="BlogController">
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
            <%--   <c:forEach var="b"  items="${blogList}">  --%>                       
                   <tr>
                   <tr ng-repeat="b in aa | filter:test">
						<td> {{b.blogname}}</td>
						<td>{{b.blogTitle}}</td>
						<td>{{b.creationDate}}</td>
						<td><a href="blogpage?id={{b.blogId}}">view details</a></td>
                   </tr>
                       <%--  </c:forEach> --%>
  </tbody>
  </table>
  </div>
  </div>
  </div>
<%@include file="footer.jsp" %>
</body>
</html>