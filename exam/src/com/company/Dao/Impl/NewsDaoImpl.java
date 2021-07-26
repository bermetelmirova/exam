package com.company.Dao.Impl;

import com.company.Dao.NewsDao;
import com.company.Model.NewsModel;

import java.sql.*;
import java.util.Scanner;

import static com.company.Dao.BaseDao.connect;

public class NewsDaoImpl implements NewsDao {
    public void insert(NewsModel newsModel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите заголовок новости: ");
        newsModel.setHeadline(sc.nextLine());
        System.out.println("Введите текст новости: ");
        newsModel.setText(sc.nextLine());
    }

    @Override
    public void createNews() {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO news(header, text_news, time_of_publication)" +
                     "values(?, ?, now())")) {
            NewsModel newsModel = new NewsModel();
            insert(newsModel);
            preparedStatement.setString(1, newsModel.getHeadline());
            preparedStatement.setString(2, newsModel.getText());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void showNews(NewsModel newsModel) {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM news WHERE id = " + newsModel.getId())) {
            if (resultSet.next()) {
                System.out.println(resultSet.getInt("header"));
                System.out.println(resultSet.getString("text_news"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteNews(NewsModel newsModel) {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE * FROM news WHERE id = ?")) {
            preparedStatement.setInt(1, newsModel.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateNews(NewsModel newsModel) {
        Scanner sc = new Scanner(System.in);
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE news SET headline = ?, text_news = ? WHERE id = ?")) {
            System.out.println("Введите новый заголовок:");
            newsModel.setHeadline(sc.nextLine());
            preparedStatement.setString(1, newsModel.getHeadline());
            System.out.println("Введите новый текст:");
            newsModel.setText(sc.nextLine());
            preparedStatement.setString(3, newsModel.getText());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
