package app.servlets;

import app.entities.AuthUser;
import app.entities.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(User user);

    String saveUser(User user);

    void saveAuthUser(AuthUser authUser);
}
