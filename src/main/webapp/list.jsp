<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/static/css/index.css" rel="stylesheet">
<script type="text/javascript" src="/static/jars/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/static//js/index.js"></script>

</head>
<body>
    <h2>首页<h2>
    
    <table class="table">
        <thead>
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>生日</th>
                <th>性别</th>
                <th>年龄</th>
                <th>工资</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
           <tr>
               <td>${user.t_id}</td>
               <td>${user.t_name}</td>
               <td>${user.t_birth}</td>
                <td>${user.t_sex}</td>
               <td>${user.t_age}</td>
               <td>${user.t_salary}</td>
           </tr>
          </c:forEach>
        </tbody>
    </table>
</body>
</html>