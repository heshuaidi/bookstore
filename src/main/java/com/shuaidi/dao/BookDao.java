package com.shuaidi.dao;

import com.shuaidi.domain.Book;

/**
 * Created by shuaidi on 16-10-6.
 */
public interface BookDao {
    void save(Book book);

    Book findBookById(Integer bookId);
}
