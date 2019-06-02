<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>form

<form:form action="${pageContext.reuest.contextPath}/authenticateTheUser" method="POST">
<p>
    User name: <input type="text" name="username">
</p>

    <p>
        Password: <input type="password" name="password">
    </p>

    <input type="submit" value="Login">

</form:form>

</body>
</html>
