<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*,java.text.NumberFormat"%>
     <%@ page import="com.Convert.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Pages</title>
</head>
<body>

<%
int number=Integer.parseInt(request.getParameter("number"));

NumberToWord num= new NumberToWord();
//out.println(num.convertToWord(number));
%>
This Normal View   "<%=num.convertToWord(number) %>"    only.
<br><br>
In TextField View You Do This Way <input type="text" name="amt" value="<%=num.convertToWord(number)%>" size="45">
</body>
</html>