<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>文件上传</title>

    <style>

        .row {
        width: 100%;
        margin: 0 auto;
    }
    .block {
        width: 25%;
        float: left;
    }

    </style>
</head>

    <form action="${pageContext.request.contextPath}/upload/importXls" method="post" enctype="multipart/form-data">
        名称<input type="text" name="username"><br/>
        文件1<input type="file" name="uploadFile"><br/>
        <input type="submit" value="提交">
    </form>



<br>
<br>
<br>
<br>


<div class="row">
    <div class="block">
        <span></span>
             <%--<textarea  cols="110" rows="30"
                        style="width:98%;line-height:150%;font-size: 16px;font-family: PingFangSC-Regular, tahoma, arial, sans-serif;
          " readonly="true" ></textarea>--%>

    </div>

    <div class="block">

        <textarea  cols="110" rows="30"
                   style="width:98%;line-height:150%;font-size: 16px;font-family: PingFangSC-Regular, tahoma, arial, sans-serif;
           background: #F9F9F9;color: #333;" readonly="true" >
今日线索：${allImpPhoneSise }条
本地去重：${repeatPhoneSise }条
去重后共：${allPhoneSise }条
导入新线：${newPhoneSise }条
傲天重线：${repeatSize }条</textarea>

    </div>
    <div class="block">
        <textarea  cols="110" rows="30"
                   style="width:98%;line-height:150%;font-size: 16px;font-family: PingFangSC-Regular, tahoma, arial, sans-serif;
           background: #F9F9F9;color: #333;" readonly="true" >
<c:forEach items="${repeatPhone }" var="item" >${ item.key}:${ item.value}
</c:forEach></textarea>
    </div>
</div>









<%--<c:forEach items="${repeatPhone }" var="item" >
    ${ item.key}:${ item.value}\n
</c:forEach>

<c:forEach items="${map}" var="node">
    姓名：<c:out value="${node.key}"></c:out>
    住址：<c:out value="${node.value}"></c:out>
    <br/>
</c:forEach>--%>






</body>
</html>
