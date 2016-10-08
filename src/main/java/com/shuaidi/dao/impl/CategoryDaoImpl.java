package com.shuaidi.dao.impl;

import com.shuaidi.dao.CategoryDao;
import com.shuaidi.domain.Category;
import com.shuaidi.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by shuaidi on 16-10-6.
 */
public class CategoryDaoImpl implements CategoryDao {
    private QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());

    public void save(Category category) {
        try {
            qr.update("insert into categories (name,description) values (?,?)", category.getName(), category.getDescription());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Category> findAll() {
        try {
            return qr.query("select * from categories", new BeanListHandler<Category>(Category.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Category findById(Integer categoryId) {
        try {
            return qr.query("select * from categories where id=?", new BeanHandler<Category>(Category.class), categoryId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean findByName(String categoryName) {
        try {
            Category category = qr.query("select * from categories where name=?", new BeanHandler<Category>(Category.class), categoryName);
            return category == null ? false : true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
