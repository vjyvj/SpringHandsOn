<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<script type="text/javascript" src="webjars/jquery/2.2.4/jquery.min.js" ></script>
	<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	<!-- <script type="text/javascript" th:src=@{/js/main.js} src="../static/js/main.js"></script> -->
	<link rel="stylesheet" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-block">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>NAME</th>
							<th>AGE</th>
							<th>LOCATION</th>
							<th>USERTYPE</th>
						</tr>	
					</thead>
					<tbody>
						<c:forEach begin="0" items="${users}" var="user">
        					<tr>
						        <td>
						            <c:out value="${user.id}" />
						        </td>
						         <td>
						            <c:out value="${user.name}" />
						        </td>
						         <td>
						            <c:out value="${user.age}" />
						        </td>
						         <td>
						            <c:out value="${user.location}" />
						        </td>
						         <td>
						            <c:out value="${user.userType}" />
						        </td>
 							</tr>
        				</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>