<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/13/2025
  Time: 12:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Đăng ký</title></head>
<body>
<h2>Đăng ký</h2>
<form method="post" action="register">
    Tên đăng nhập: <input type="text" name="username"/><br/>
    Mật khẩu: <input type="password" name="password"/><br/>
    Email: <input type="email" name="email"/><br/>
    SĐT: <input type="text" name="phone"/><br/>
    <input type="submit" value="Đăng ký"/>
</form>
<p><a href="login">Quay lại đăng nhập</a></p>
<p style="color:red">${error}</p>
</body>
</html>
