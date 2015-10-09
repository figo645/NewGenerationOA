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
	<h2>Add Book</h2>
	bookname:
	<input type="text" name="questionTypeName" id="typeName"
		onkeyup="getTypeName(this,'tcsQsAjax.do');" />
	<div id="typeNameDiv"
		style="position: absolute; bottom: 1in; right: 1in; top: 1in; z-index: 1001; overflow-y: auto; display: none; border: #acc8ec 1px solid;" />
		
		
</body>
</html>