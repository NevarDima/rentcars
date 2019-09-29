package dao;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    String save(User user);
}
