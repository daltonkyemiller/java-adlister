<%--
  Created by IntelliJ IDEA.
  User: dalton
  Date: 7/15/22
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/guess">
            <label for="guess">
                Guess a number between 1 and 3:
                <input id="guess" type="number" name="guess" min="1" max="3" autofocus required>
            </label>
            <input type="submit" value="Submit">
        </form>

    </body>
</html>
