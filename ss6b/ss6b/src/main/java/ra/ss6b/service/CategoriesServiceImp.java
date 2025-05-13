package ra.ss6b.service;

import ra.ss6b.dao.CategoriesDAOImp;
import ra.ss6b.dao.CategoriesDao;
import ra.ss6b.model.Categories;

import java.util.List;

public class CategoriesServiceImp implements CategoriesService {
    private final CategoriesDao categoriesDAO;

    public CategoriesServiceImp() {
        categoriesDAO = new CategoriesDAOImp();
    }

    @Override
    public List<Categories> findAll() {
        return categoriesDAO.findAll();
    }

    @Override
    public boolean save(Categories catalog) {
        return categoriesDAO.save(catalog);
    }

    @Override
    public Categories findById(int id) {
        return categoriesDAO.findById(id);
    }

    @Override
    public boolean update(Categories catalog) {
        return categoriesDAO.update(catalog);
    }

    @Override
    public boolean delete(int catalogId) {
        return categoriesDAO.delete(catalogId);
    }
}
