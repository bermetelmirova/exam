package com.company.Dao;

import com.company.Model.NewsModel;

public interface NewsDao {
    void createNews();

    void showNews(NewsModel newsModel);

    void deleteNews(NewsModel newsModel);

    void updateNews(NewsModel newsModel);
}
