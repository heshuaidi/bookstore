<%--
  Created by IntelliJ IDEA.
  User: shuaidi
  Date: 16-10-7
  Time: 下午6:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/header.jsp"%>
商品分类：
<c:forEach items="${categoryList}" var="cs">
    <a href="${pageContext.request.contextPath}/client/ClientServlet?op=listBooksByCategoryId&categoryId=${cs.id}">${cs.name}</a>&nbsp;&nbsp;
</c:forEach>
<br><br><br>
<table>
    <tr>
        <c:forEach items="${page.records}" var="b">
            <td>
                <img src="${pageContext.request.contextPath}/images/${b.path}/${b.filename}"><br>
                书名：${b.name}<br>
                作者：${b.author}<br>
                单价：${b.price}<br>
                <a href="${pageContext.request.contextPath}/client/ClientServlet?op=buy&bookId=${b.id}">加入购物车</a>
            </td>
        </c:forEach>
    </tr>
</table>
<br>
<%@ include file="/commons/page.jsp"%>
</body>
</html>
