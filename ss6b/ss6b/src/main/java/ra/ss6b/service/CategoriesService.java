package ra.ss6b.service;


import ra.ss6b.model.Categories;

import java.util.List;

public interface CategoriesService {
    List<Categories> findAll();

    boolean save(Categories catalog);

    Categories findById(int id);

    boolean update(Categories catalog);

    boolean delete(int catalogId);
}