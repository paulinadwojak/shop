package shop.users.services;

import shop.users.models.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    void saveUser(User user);

    User getUser(int userId);

    void deleteUser(int userId);
}
