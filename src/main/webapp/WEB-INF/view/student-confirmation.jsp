<%--
  Created by IntelliJ IDEA.
  User: Aditya
  Date: 14-12-2021
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

    The student is confirmed: ${student.firstName} ${student.lastName}
    <br>
    Country: ${student.country}
    <br>
    Favourite Language: ${student.language}
    <br>
    Operating Systems:
    <ul>
        <c:forEach var="temp" items="${student.OS}">
            <li>${temp}</li>
        </c:forEach>

    </ul>
</body>
</html>
