<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>文件上传</title>
</head>
<body>



<h1>飞鱼导入</h1>
    <form action="${pageContext.request.contextPath}/feiyuclue/importFeiyu" method="post" enctype="multipart/form-data">
        名称<input type="text" name="username"><br/>
        文件1<input type="file" name="uploadFile"><br/>
        <input type="submit" value="提交">
    </form>

</body>
</html>
