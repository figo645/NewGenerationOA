<%
String arrays[] = {"anna"};
 
if (null != request.getParameter("q") && 
request.getParameter("q").startsWith("a")
		){
  out.println("annas");
}
%>