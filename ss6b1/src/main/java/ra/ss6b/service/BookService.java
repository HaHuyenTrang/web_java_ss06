package ra.ss6b.service;

import ra.ss6b.dao.BookDao;
import ra.ss6b.model.Book;

import java.util.List;

public class BookService {
    private final BookDao dao = new BookDao();

    public List<Book> findAll() {
        return dao.getAll();
    }

    public Book findByCode(String code) {
        return dao.getByCode(code);
    }

    public void save(Book b) {
        dao.insert(b);
    }

    public void update(Book b) {
        dao.update(b);
    }

    public void delete(String code) {
        dao.delete(code);
    }
}
