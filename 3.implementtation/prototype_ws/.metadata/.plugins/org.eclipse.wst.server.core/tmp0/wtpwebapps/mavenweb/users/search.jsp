<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2>Search Contact</h2>
	<form method="post" action="<%=request.getContextPath()%>/contact/search">
		bookname:<input type="text" name="username" id="name"> author:<input
			type="text" name="password" id="author"> <input type="submit"
			value="submit">
	</form>

	<span>
		<table>
			<tr>
				<td>table</td>
			</tr>
			<c:forEach var="contact" items="${contacts}">
				<tr>
					<td>${contact.username}</td>
				</tr>
			</c:forEach>


		</table>

	</span>
</body>
</html>