package com.shuaidi.web.controller;

import com.shuaidi.domain.Category;
import com.shuaidi.service.BusinessService;
import com.shuaidi.service.impl.BusinessServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by shuaidi on 16-10-7.
 */
public class ClientServlet extends HttpServlet {
    private BusinessService businessService = new BusinessServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String op = req.getParameter("op");
        if("listBooks".equals(op)){
            listBooks(req,resp);
        }
    }
    //显示默认主页的内容
    private void listBooks(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categoryList = businessService.findAllCategories();
        req.setAttribute("categoryList",categoryList);

//        req.getParameter("page")
        req.getRequestDispatcher("/books.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
