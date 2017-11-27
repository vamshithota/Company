<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<title>Insert title here</title>

<body>
<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
			<input type="button" value="Add Customer"
				   onclick="window.location.href='showformForAdd'; return false;"
				   class="add-button"/>
		
		<table>
		<tr>
		<th>FirstName </th>
		<th>LastName</th>
		<th>Email</th>
		<th>Action</th>
		</tr>
		
		<c:forEach var="tempCustomerVar" items="${customers}">
		<c:url var="updateLink" value ="/customer/showFormUpdate">
		<c:param name="id" value="${tempCustomerVar.id}" ></c:param>
		</c:url>
		<c:url var="deleteCustomerLink" value="/customer/deleteCustomer">
		<c:param name="id" value="${tempCustomerVar.id}"></c:param>
		</c:url>
		<tr>
		 <td> ${tempCustomerVar.firstName}
		</td>
		<td>${tempCustomerVar.lastName}</td>
		<td>${tempCustomerVar.email}</td>
		<td> <a href="${updateLink}">UPDATE</a> </td>
		<td> <a href="${deleteCustomerLink}" onclick="if (!(confirm('Delete this customer???'))) return false">DELETE</a> </td>
		</tr>
		</c:forEach>
		
		</table>
		
		</div>
		</div>
	</body>
</html>