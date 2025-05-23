package web.service;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);

    List<User> allUser();

    Optional<User> findById(int id);

    void updateUser(User user);

    void deleteById(int id);
}
