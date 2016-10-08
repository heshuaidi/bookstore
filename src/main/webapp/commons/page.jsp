<%--
  Created by IntelliJ IDEA.
  User: shuaidi
  Date: 16-10-7
  Time: 下午8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" pageEncoding="UTF-8" %>
第${page.currentPageNum}页/共${page.totalPageSize}页&nbsp;&nbsp;
<a href="${pageContext.request.contextPath}${page.uri}&pagenum=${page.prePageNum}">上一页</a>
<a href="${pageContext.request.contextPath}${page.uri}&pagenum=${page.nextPageNum}">下一页</a>
