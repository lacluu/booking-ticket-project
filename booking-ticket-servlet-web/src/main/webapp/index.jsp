<%--
  Created by IntelliJ IDEA.
  User: luu.lac
  Date: 9/16/2020
  Time: 10:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
    <h3>${requestScope.data}</h3>
    <form action="servlet1" method="post">
        Name:<input type="text" name="userName"/><br/>
        Password:<input type="password" name="userPass"/><br/>
        <input type="submit" value="login"/>
    </form>
</body>
</html>
