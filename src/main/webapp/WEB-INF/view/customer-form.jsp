<%--
  Created by IntelliJ IDEA.
  User: Aditya
  Date: 14-12-2021
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
    Fill Form. (*) means mandatory
    <form:form action="processForm" modelAttribute="customer">

        First name: <form:input path="firstName"/>
        <br>

        Last name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br>

        Free Passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br>

        Postal Code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br>
        Course Code: <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error"/>
        <br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
