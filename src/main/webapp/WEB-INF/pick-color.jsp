<%--
  Created by IntelliJ IDEA.
  User: dalton
  Date: 7/15/22
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/viewcolor" method="post">
            <label for="color">
                What is your favorite color?
                <input type="text" id="color" name="color"/>
            </label>
            <input type="submit" value="Submit">
        </form>

    </body>
</html>
