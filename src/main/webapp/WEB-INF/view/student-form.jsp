<%--
  Created by IntelliJ IDEA.
  User: Aditya
  Date: 14-12-2021
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>


    <form:form action="processForm" modelAttribute="student">
        First Name:  <form:input path="firstName"/>
        <br/>
        Last Name: <form:input path="lastName"/>
        <br/>
        <form:select path="country">
<%--            <form:option value="Brazil" label="Brazil"/>--%>
<%--            <form:option value="France" label="France"/>--%>
<%--            <form:option value="Germany" label="Germany"/>--%>
<%--            <form:option value="India" label="India"/>--%>
            <form:options items="${countryOptions}"/>
        </form:select>
        <br>
        Favourite Language:
        <form:radiobuttons path="languageOptions" items="${student.languageOptions}"  />
<%--        Java <form:radiobutton path="language" value="Java"/>--%>
<%--        C# <form:radiobutton path="language" value="C#"/>--%>
<%--        PHP <form:radiobutton path="language" value="PHP"/>--%>
<%--        Ruby <form:radiobutton path="language" value="Ruby"/>--%>
        <br>
        Operating System:
        Linux <form:checkbox path="OS" value="Linux"/>
        Windows <form:checkbox path="OS" value="Windows "/>
        Mac OS <form:checkbox path="OS" value="Mac OS"/>

        <br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
