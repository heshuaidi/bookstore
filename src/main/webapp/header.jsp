<%--
  Created by IntelliJ IDEA.
  User: shuaidi
  Date: 16-10-7
  Time: 下午6:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>岛上书店</title>

    <meta content="no-cache" http-equiv="pragma">
    <meta content="no-cache" http-equiv="cache-control">
    <meta content="0" http-equiv="expires">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/util.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
<h1>欢迎光临本小店</h1>
<br><br>
<a href="${pageContext.request.contextPath}">首页</a>&nbsp;&nbsp;
<c:if test="${sessionScope.customer == null}">
    <a href="${pageContext.request.contextPath}/regist.jsp">注册</a>&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath}/login.jsp">登陆</a>&nbsp;&nbsp;
</c:if>
<c:if test="${sessionScope.customer != null}">
    欢迎您：${sessionScope.customer.username}
    <a href="${pageContext.request.contextPath}/client/ClientServlet?op=logout">注销</a>&nbsp;&nbsp;
</c:if>
<a href="${pageContext.request.contextPath}/client/ClientServlet?op=showOrders">我的订单</a>&nbsp;&nbsp;
<a href="${pageContext.request.contextPath}/showCart.jsp">我的购物车</a>&nbsp;&nbsp;
<hr/>
