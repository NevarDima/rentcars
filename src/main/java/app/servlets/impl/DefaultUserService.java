package app.servlets.impl;

import app.entities.AuthUser;
import app.entities.User;
import app.servlets.UserService;
import dao.UserDao;
import dao.impl.DefaultUserDao;

import java.util.List;

public class DefaultUserService implements UserService {
    private UserDao userDao = DefaultUserDao.getInstance();

    private static volatile UserService instance;

    public static UserService getInstance() {
        UserService localInstance = instance;
        if (localInstance == null) {
            synchronized (UserService.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DefaultUserService();
                }
            }
        }
        return localInstance;
    }

    @Override
    public List<User> getUsers(User user) {
        return userDao.getUsers();
    }

    @Override
    public String saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void saveAuthUser(AuthUser authUser) {

    }
}
