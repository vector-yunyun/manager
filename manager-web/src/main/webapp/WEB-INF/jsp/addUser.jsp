<%--
  Created by IntelliJ IDEA.
  User: yyh
  Date: 2019/12/15
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        用户姓名：<input type="text" name="username"/><br/>
        用户年龄：<input type="text" name="userage"/><br/>
        <input type="submit" value="提交"/>
    </form>

</body>
</html>
