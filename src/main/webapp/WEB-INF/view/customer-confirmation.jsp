<%--
  Created by IntelliJ IDEA.
  User: Aditya
  Date: 14-12-2021
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
    The customer is confirmed: ${customer.firstName} ${customer.lastName}
    <br>
    Free passes: ${customer.freePasses}
    <br>
    Postal Code: ${customer.postalCode}
    <br>
    Course Code: ${customer.courseCode}
</body>
</html>
