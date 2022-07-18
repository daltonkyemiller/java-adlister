<%--
  Created by IntelliJ IDEA.
  User: dalton
  Date: 7/18/22
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
        <link href="../css/ads.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <main>
            <div id="ads">
                <c:forEach var="ad" items="${ads}">
                    <div class="ad">

                        <h1>${ad.getTitle()}</h1>
                        <p>${ad.getDescription()}</p>
                    </div>
                </c:forEach>
            </div>
        </main>
    </body>
</html>
