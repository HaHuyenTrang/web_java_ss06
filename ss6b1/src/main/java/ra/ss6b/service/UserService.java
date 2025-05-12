package ra.ss6b.service;

import ra.ss6b.dao.UserDao;
import ra.ss6b.model.User;

public class UserService {
    private final UserDao userDao = new UserDao();

    public boolean register(User user) {
        return userDao.save(user);
    }

    public User login(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
}
