package com.company;

import com.company.Dao.Impl.NewsDaoImpl;
import com.company.Dao.NewsDao;
import com.company.Model.NewsModel;

public class Main {

    public static void main(String[] args) {
        NewsModel news = new NewsModel();
        NewsDao newsDao = new NewsDaoImpl();
        newsDao.createNews();
        news.
    }
}
