package com.company;

import com.company.Dao.Impl.NewsDaoImpl;
import com.company.Dao.NewsDao;
import com.company.Model.NewsModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        NewsDaoImpl newsDao = new NewsDaoImpl();
        ArrayList<NewsModel> newsModels = new ArrayList<>();

        while (true){
            System.out.println("1.Создать новость\n2.Отобразить новость\n3.Изменить новость по id\n4.Удалить новость по id\nВведите пункт меню: \n");
            int choice = sc.nextInt();
            switch (choice){

                case 1: newsDao.createNews();break;
                case 2: newsDao.showNews(choose(newsModels));break;
                case 3: newsDao.updateNews(choose(newsModels));break;
                case 4: newsDao.deleteNews(choose(newsModels));break;
            }
        }



    }

    static NewsModel choose(List<NewsModel> newsModels) throws SQLException {
        NewsDaoImpl newsDao = new NewsDaoImpl();
        newsModels.addAll(newsDao.getAll());
        System.out.println("\nВведите номер новости: ");
        int id = sc.nextInt();
        return newsModels.get(id - 1);
    }
}
