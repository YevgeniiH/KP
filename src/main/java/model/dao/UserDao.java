package model.dao;

import model.User;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(User user);

    Collection<User> getUser(String search);

    public List findByUser(LocalDate dob, String email, String login, String pass, String name, String surname, Long tel, String role);

}
