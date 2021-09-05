package kg.academy.dao.impl;

import kg.academy.dao.UserDao;
import kg.academy.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static kg.academy.config.DBConfig.connect;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(User user) {
        try (PreparedStatement preparedStatement = connect().prepareStatement("insert into users (request_date_time, user_name, birth_year, gender)"
                + "values (now(),?, ?, ?)")) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getBirtYear());
            preparedStatement.setBoolean(3, user.isGender());
            int row = preparedStatement.executeUpdate();
            if (row != 0)
                return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public List<User> getAll() {
        ArrayList<User> users = new ArrayList<>();
        try (ResultSet resultSet = connect().createStatement().executeQuery("select * from users")) {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("user_name"));
                user.setBirtYear(resultSet.getInt("birth_year"));
                user.setGender(resultSet.getBoolean("gender"));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        try (PreparedStatement preparedStatement = connect().prepareStatement("delete * from users where users.id = ?")) {
            preparedStatement.setLong(1, id);
            int row = preparedStatement.executeUpdate();
            if (row != 0)
                return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public User getById(Long id) {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        try (Connection connection = connect();
             ResultSet resultSet = connection.createStatement().executeQuery("select  * from users where id =" + id)) {
            while (resultSet.next()) {
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("user_name"));
                user.setBirtYear(resultSet.getInt("birth_year"));
                user.setGender(resultSet.getBoolean("gender"));
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public List<User> getByBirthYear(int date) {
        ArrayList<User> users = new ArrayList<>();
        try (Connection connection = connect();
             ResultSet resultSet = connection.createStatement().executeQuery("select  * from users where birth_year = " + date)
        ) {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("user_name"));
                user.setBirtYear(resultSet.getInt("birth_year"));
                user.setGender(resultSet.getBoolean("gender"));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<User> getByName(String name) {
        ArrayList<User> users = new ArrayList<>();
        try (Connection connection = connect();
             ResultSet resultSet = connection.createStatement().executeQuery("select  * from users where user_name = '" + name + "'")
        ) {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("user_name"));
                user.setBirtYear(resultSet.getInt("birth_year"));
                user.setGender(resultSet.getBoolean("gender"));
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    @Override
    public List<User> getByGender(boolean gender) {
        ArrayList<User> users = new ArrayList<>();
        try (Connection connection = connect();
             ResultSet resultSet = connection.createStatement().executeQuery("select  * from users where gender = " + gender)
        ) {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("user_name"));
                user.setBirtYear(resultSet.getInt("birth_year"));
                user.setGender(resultSet.getBoolean("gender"));
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }
}
