package ra.ss6b.controller;

import org.springframework.stereotype.Controller;
import ra.ss6b.model.Book;
import ra.ss6b.service.BookService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookController", value = "/books")
public class BookController extends HttpServlet {
    private final BookService service = new BookService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(2);
        String action = req.getParameter("action");
        if (action == null) action = "list";

        switch (action) {
            case "add":
                req.getRequestDispatcher("formAdd.jsp").forward(req, resp);
                break;
            case "edit":
                String code = req.getParameter("bookCode");
                Book b = service.findByCode(code);
                req.setAttribute("now", new java.util.Date());
                req.setAttribute("book", b);
                req.getRequestDispatcher("formEdit.jsp").forward(req, resp);
                break;
            default:
                List<Book> list = service.findAll();
                req.setAttribute("books", list);
                req.getRequestDispatcher("views/listBook.jsp").forward(req, resp);


        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("action");
        String code = req.getParameter("bookCode");
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String genre = req.getParameter("genre");
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        switch (action) {
            case "create":
                service.save(new Book(code, title, author, genre, quantity));
                break;
            case "update":
                service.update(new Book(code, title, author, genre, quantity));
                break;
            case "delete":
                service.delete(code);
                break;
        }

        resp.sendRedirect("books");
    }
}
