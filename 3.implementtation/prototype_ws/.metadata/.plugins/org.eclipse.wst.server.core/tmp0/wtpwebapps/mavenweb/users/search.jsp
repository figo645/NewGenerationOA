<%@ page contentType="text/html;charset=utf-8"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2>Search Contact</h2>
	<form method="post"
		action="<%=request.getContextPath()%>/contact/search">
		bookname:<input type="text" name="username" id="name"> author:<input
			type="text" name="password" id="author"> <input type="submit"
			value="submit">
	</form>
	<form method="post"
		action="<%=request.getContextPath()%>/contact/deleteids">
		<span>
			<table border="1">
				<tr>
					<th>select</th>
					<th>username</th>
					<th>password</th>
					<th>action</th>
					<th>retired</th>
				</tr>
				<c:forEach var="contact" items="${contacts}">
					<tr>
						<td><input type="checkbox" name="ids" id="concheck"
							value="${contact.idcontact}" /></td>
						<td>${contact.username}</td>
						<td>${contact.password}</td>
						<td><a
							href="<%=request.getContextPath()%>/contact/preupdate/${contact.idcontact}">修改</a></td>
						<td>${contact.retired}</td>
					</tr>
				</c:forEach>

			</table>
		</span> <br /> <br /> <br />
		<div>
			<input type="submit" name="delete" id="condel" value="删除" />
		</div>
	</form>
</body>
</html>