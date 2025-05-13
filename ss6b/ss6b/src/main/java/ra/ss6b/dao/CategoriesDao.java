package ra.ss6b.dao;

import ra.ss6b.model.Categories;

import java.util.List;

public interface CategoriesDao {
    List<Categories> findAll();

    boolean save(Categories catalog);

    Categories findById(int catalogId);

    boolean update(Categories catalog);

    boolean delete(int catalogId);
}
