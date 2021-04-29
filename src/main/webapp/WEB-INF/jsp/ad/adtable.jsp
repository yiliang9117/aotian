<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-04-28
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/layui/css/layui.css">
    <script type="text/javascript" src="{pageContext.request.contextPath}/static/css/layui/layui.js"></script>

</head>
<body>


<table class="layui-table" style="width: 800px;">
    <colgroup>
        <col width="250">
        <col>
        <col>
        <col>
        <col>
        <col>
        <col>
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>计划名称</th>
        <th>合计</th>
        <th>开单率</th>
        <th>A</th>
        <th>B</th>
        <th>C</th>
        <th>D</th>
        <th>E</th>
        <th>无</th>
    </tr>
    </thead>

    <tbody>
<c:forEach items="${adData}" var="ad">
    <tr>
        <td>${ad.advertiserNameAdName}</td>
        <td>${ad.clueSum}</td>
        <td>${ad.turnoverRatio}</td>
        <td>${ad.aClue}</td>
        <td>${ad.bClue}</td>
        <td>${ad.cClue}</td>
        <td>${ad.dClue}</td>
        <td>${ad.eClue}</td>
        <td>${ad.nullClue}</td>
    </tr>


</c:forEach>





    </tbody>
</table>

</body>
</html>
