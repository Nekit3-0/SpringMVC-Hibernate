package web.dao;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void save(User user);

    List<User> allUser();

    Optional<User> findById(int id);

    void updateUser(User user);

    void deleteUser(int id);
}
