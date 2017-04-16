<%@ page import="java.io.*,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
<script>
function greatest(var a, var b, var c){
document.getElementById('gr').innerHTML = b; 
}
</script></head>
<body>
<%! int a =6;
	int b = 4; %>
sum = <c:out value="${a+b}"/> <br>

</body>
</html>