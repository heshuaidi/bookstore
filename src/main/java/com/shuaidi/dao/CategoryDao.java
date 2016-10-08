package com.shuaidi.dao;

import com.shuaidi.domain.Category;

import java.util.List;

/**
 * Created by shuaidi on 16-10-6.
 */
public interface CategoryDao {
    void save(Category category);

    List<Category> findAll();

    Category findById(Integer categoryId);

    boolean findByName(String categoryName);
}
