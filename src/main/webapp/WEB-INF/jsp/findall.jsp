<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <h1>展示用户明细</h1>
    <title>Title</title>
</head>
<body>
    <table border="1px">
        <tr>
        <th>用户id</th>
        <th>用户姓名</th>
        <th>用户金额</th>
        </tr>
        <c:forEach items="${account}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.money}</td>
            </tr>
        </c:forEach>


    </table>
</body>
</html>
