package shop.users.dao;

import shop.users.models.User;

import java.util.List;

public interface UserDAO {

    List<User> getUserList();

    void saveUser(User user);

    User getUser(int userId);

    void deleteUser(int userId);
}
