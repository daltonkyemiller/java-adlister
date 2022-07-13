<%--
  Created by IntelliJ IDEA.
  User: dalton
  Date: 7/13/22
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username != null
            && password != null
            && username.equalsIgnoreCase("admin")
            && password.equalsIgnoreCase("password"))
        response.sendRedirect("/profile.jsp");

%>
<html>
    <%@ include file="partials/head.jsp" %>
    <body>
        <%@ include file="partials/navbar.jsp" %>
        <main>
            <form method="post">
                <label>
                    Username:
                    <input type="text" name="username" value=""/>
                </label>
                <label>
                    Password:
                    <input type="password" name="password" value=""/>
                </label>
                <input type="submit" value="login"/>
            </form>
        </main>
    </body>
</html>
