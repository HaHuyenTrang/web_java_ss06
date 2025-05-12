<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Đăng nhập</title></head>
<body>
<h2>Đăng nhập</h2>
<form method="post" action="login">
    Tên đăng nhập: <input type="text" name="username" /><br/>
    Mật khẩu: <input type="password" name="password" /><br/>
    <input type="submit" value="Đăng nhập"/>
</form>
<p><a href="register">Chưa có tài khoản? Đăng ký</a></p>
<p style="color:red">${error}</p>
</body>
</html>
