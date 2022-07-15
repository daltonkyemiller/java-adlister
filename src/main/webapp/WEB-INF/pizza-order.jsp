<%--
  Created by IntelliJ IDEA.
  User: dalton
  Date: 7/15/22
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/pizza-order" method="post">
            <label for="crust">Crust type:
                <select name="crust" id="crust">
                    <option value="thin">Thin</option>
                    <option value="thick">Thick</option>
                </select>
            </label>
            <label for="size">
                Size:
                <select name="size" id="size">
                    <option value="small">Small</option>
                    <option value="medium">Medium</option>
                    <option value="large">Large</option>
                </select>
            </label>

            <label for="sauce">
                Sauce Type:
                <select name="sauce" id="sauce">
                    <option value="marinara">Marinara</option>
                    <option value="white">White</option>
                    <option value="no-sauce">No Sauce</option>
                </select>
            </label>

            Toppings:
            <label for="pepperoni">
                <input type="checkbox" name="toppings" value="pepperoni" id="pepperoni">
                Pepperoni
            </label>
            <label for="mushrooms">
                <input type="checkbox" name="toppings" value="mushrooms" id="mushrooms">
                Mushrooms
            </label>

            <label for="sausage">
                <input type="checkbox" name="toppings" value="sausage" id="sausage">
                Sausage
            </label>

            <label for="address">
                Address:
                <input type="text" name="address" id="address" placeholder="Enter your address...">
            </label>
            <input type="submit" value="Order">
        </form>

    </body>
</html>
