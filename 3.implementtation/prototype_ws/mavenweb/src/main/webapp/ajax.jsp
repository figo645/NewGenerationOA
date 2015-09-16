<html>
<head>
<style type="text/css">
.input_Type{
   background-color: #FEF0C9;
}
#ul_background{
  background-color:white;
  margin-left:-40px;
  margin-top:-1px;
  list-style-type:none;
}
</style>
</head>
<body>


	<script type="text/javascript">
		function showHint(str) {
			var xmlhttp;
			if (str.length == 0) {
				document.getElementById("txtHint").innerHTML = "";
				return;
			}
			if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
				xmlhttp = new XMLHttpRequest();
			} else {// code for IE6, IE5
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					document.getElementById("txtHint").innerHTML = xmlhttp.responseText;
				}
			}
			//alert(str);
			xmlhttp.open("GET", "./hint.jsp?q=" + str, true);
			xmlhttp.send();
		}
	</script>
	<h2>Add Book</h2>
	<form method="post" action="<%=request.getContextPath()%>/book/update">
		bookname:<input type="text" id="txt1" name="name" id="name"
			onkeyup="showHint(this.value);"> 
			author:<input type="text"
			name="author" id="author">
			 <input type="submit"
			value="submit">
	</form>
	<p>
		suggestion:<span id="txtHint"></span>
	</p>
</body>
</html>