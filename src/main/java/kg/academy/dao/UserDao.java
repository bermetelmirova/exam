package kg.academy.dao;

import kg.academy.model.User;

import java.sql.Date;
import java.util.List;

public interface UserDao {
    List<User> getAll();

    boolean deleteById(Long id);

    User getById(Long id);

    boolean save(User user);

    List<User> getByBirthYear(int date);

    List<User> getByName(String name);

    List<User> getByGender(boolean gender);
}
