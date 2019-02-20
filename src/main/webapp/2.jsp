<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/1/23
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> </title>
</head>
<body>
<form action="select?type=insert" method="post">
    <h1 style="text-align: center">宠物的基本信息</h1>
     昵称：<input type="text" name="uname" id="uname">
    <br/>
    品种：<select id="pin" name="pin">
    <option value="0">请选择</option>
    <option value="1">狗</option>
    <option value="2">猫</option>
    <option value="3">兔子</option>
</select>
    <br/>
    性别<input type="radio" name="xing" id="xing" value="1">雄
    <input type="radio" name="xing" id="xingbie" value="2">雌
    <br/>
    出生日期<input type="text" name="riqi" id="riqi">yyyy-mm-dd
    <br/>
    宠物描述<input type="textarea" name="mian" id="mian">
    <br/>
    <input type="submit" value="提交">
    <input type="submit" value="重置">

</form>
</body>
</html>
