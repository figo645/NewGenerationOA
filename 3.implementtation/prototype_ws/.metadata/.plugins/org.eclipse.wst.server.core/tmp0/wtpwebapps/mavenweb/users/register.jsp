<%@ page contentType="text/html;charset=utf-8"%>
<html>
<body>
	<h2>添加用户</h2>
	<form method="post"
		action="<%=request.getContextPath()%>/contact/addsearch">
		<table>
			<tr>
				<td>username</td>
				<td><input type="text" name="username" id="username"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password" id="password"></td>
			</tr>

		</table>
		<input type="submit" name="register" value="录入">
	</form>
</body>
</html>