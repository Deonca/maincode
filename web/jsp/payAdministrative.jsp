<%--
  Created by IntelliJ IDEA.
  User: 96986
  Date: 2020/6/7
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <title>预缴物业费</title>
    <link rel="stylesheet" href=<%=path+"/layui/css/layui.css"%>>
    <script type="text/javascript" src="<%=path+"/layui/layui.js"%>"></script>
    <script type="text/javascript" src="<%=path+"/js/json2.js"%>"></script>
</head>
<body>
<div class="layui-row">
    <div class="layui-col-md6 layui-col-md-offset3">
        <div class="layui-form-item">
            <label class="layui-form-label">输入框</label>
            <div class="layui-input-block">
                <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
</div>
</body>
</html>
