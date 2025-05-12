package ra.ss6b.controller;

import ra.ss6b.model.User;
import ra.ss6b.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterController extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        User user = new User(0, username, password, email, phone);
        boolean result = userService.register(user);
        if (result) {
            resp.sendRedirect("login");
        } else {
            req.setAttribute("error", "Đăng ký thất bại!");
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
        }
    }
}
