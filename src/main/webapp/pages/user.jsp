<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2019/6/26
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户</title>
</head>
<body>
<table border="1">
    <tr>
        <td>用户</td>
        <td>密码</td>
        <td>余额</td>
    </tr>
    <tr>
        <td>${USER.uname}</td>
        <td>${USER.upwd}</td>
        <td>${USER.balance}</td>
    </tr>
</table>
</body>
</html>
