package com.shuaidi.service.impl;

import com.shuaidi.common.Page;
import com.shuaidi.dao.BookDao;
import com.shuaidi.dao.CategoryDao;
import com.shuaidi.dao.impl.BookDaoImpl;
import com.shuaidi.dao.impl.CategoryDaoImpl;
import com.shuaidi.domain.*;
import com.shuaidi.service.BusinessService;

import java.util.List;

/**
 * Created by shuaidi on 16-10-6.
 */
public class BusinessServiceImpl implements BusinessService {
    private CategoryDao categoryDao = new CategoryDaoImpl();
    private BookDao bookDao = new BookDaoImpl();

    public void addCategory(Category category) {
       if(category == null){
           throw new IllegalArgumentException("category can not be null");
       }
       categoryDao.save(category);
    }

    public boolean categoryExist(String categoryName) {
        return categoryDao.findByName(categoryName);
    }

    public List<Category> findAllCategories() {
        return categoryDao.findAll();
    }

    public Category findCategoryById(Integer categoryId) {
        return categoryDao.findById(categoryId);
    }

    public void addBook(Book book) {
        if(book == null){
            throw new IllegalArgumentException("book can not be null");
        }
        if(book.getCategory() == null){
            throw new IllegalArgumentException("添加的书籍必须指定分类");
        }
        bookDao.save(book);
    }

    public Book findBookById(Integer bookId) {
        return bookDao.findBookById(bookId);
    }

    public Page findBookPageRecords(String pagenum) {
        int currentPageNum = 1;
        if(!pagenum.isEmpty()){
            currentPageNum = Integer.parseInt(pagenum);
        }
//        int totalRecords = bookDao.
        return null;
    }

    public Page findBookPageRecords(String pagenum, String categoryId) {
        return null;
    }

    public void regist(Customer customer) {

    }

    public Customer findCustomerById(String customerId) {
        return null;
    }

    public Customer customerLogin(String username, String password) {
        return null;
    }

    public Ordernum findOrdernum(String prefix) {
        return null;
    }

    public void updateOrdernum(Ordernum ordernum) {

    }

    public void addOrdernum(Ordernum ordernum) {

    }

    public void genOrder(Order order) {

    }

    public List<Order> findOrderByCustomer(Customer customer) {
        return null;
    }

    public Order findOrderByNum(String ordernum) {
        return null;
    }

    public List<OrderItem> findOrderItemsByOrderNum(String ordernum) {
        return null;
    }

    public void updateOrder(Order order) {

    }

    public Page findPageOrder(String pagenum) {
        return null;
    }
}
