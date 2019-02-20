<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form action="select?type=selectall" method="post">
       品种<select name="pin" id="pin">
           <option value="0">请选择</option>
       <option value="1">狗</option>
       <option value="2">猫</option>
       <option value="3">兔子</option>
       </select>
       <input type="submit" value="查询">
       <a href="2.jsp">新增宠物</a>
       <table border="1">
       <tr>
           <td>宠物昵称</td>
           <td>出生日期</td>
           <td>性别</td>
       </tr>
           <c:forEach items="${list}" var="rs">
               <tr>
                   <td>${rs.petnamee}</td>
                   <td>${rs.birthday}</td>
                   <td>${rs.petsex}</td>
               </tr>
           </c:forEach>
       </table>
   </form>
</body>
</html>
