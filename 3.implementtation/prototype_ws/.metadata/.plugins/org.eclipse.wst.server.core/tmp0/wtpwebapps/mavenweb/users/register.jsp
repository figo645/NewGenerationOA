<html>
<body>
	<h2>Add Contact</h2>
	<form method="post"
		action="<%=request.getContextPath()%>/contact/addsearch">
		username:<input type="text" name="username" id="username"> password:<input
			type="text" name="password" id="password"> <input type="submit"
			value="submit">
	</form>
</body>
</html>