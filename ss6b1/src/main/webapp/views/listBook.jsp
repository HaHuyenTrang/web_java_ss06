<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="ra.ss6b.model.Book" %>
<html>
<head>
    <title>Danh sách sách</title>
</head>
<body>
<h2>Danh sách sách</h2>
<a href="books?action=add">Thêm sách mới</a>

<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>Mã sách</th>
        <th>Tiêu đề</th>
        <th>Tác giả</th>
        <th>Thể loại</th>
        <th>Số lượng</th>
        <th>Hành động</th>
    </tr>

    <%
        List<Book> books = (List<Book>) request.getAttribute("books");
        if (books != null) {
            for (Book book : books) {
    %>
    <tr>
        <td><%= book.getBookCode() %></td>
        <td><%= book.getTitle() %></td>
        <td><%= book.getAuthor() %></td>
        <td><%= book.getGenre() %></td>
        <td><%= book.getQuantity() %></td>
        <td>
            <a href="books?action=edit&bookCode=<%= book.getBookCode() %>">Sửa</a> |
            <form action="books?action=delete&bookCode=<%= book.getBookCode() %>" method="post" style="display:inline;">
                <button type="submit" onclick="return confirm('Xác nhận xóa?')">Xóa</button>
            </form>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
