<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<body>
    <h3>登录</h3>
    <form action="login" method="post">
        <span>用户名：</span>
        <input type="text" name="username" ></br>
        <span>密码：</span>
        <input type="password" name="password" >
        <input type="hidden" name="gotoUrl" value="/demo1">
        <input type="submit">
    </form>
</body>
</html>