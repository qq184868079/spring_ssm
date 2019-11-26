<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>保存用户</h1><br>
<form name="account" action="/user/save" method="post">
    用户姓名:<input type="text" name="name"><br>
    用户金额:<input type="text" name="money"><br>
    <input type="submit" value="提交">
</form>


</body>
</html>
