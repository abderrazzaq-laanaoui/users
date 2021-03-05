package codes.laanoui.users.business;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.List;

import codes.laanoui.users.dao.UserDao;
import codes.laanoui.users.models.User;

public class DefaultUserService implements UserService {

    private UserDao userDao;
    public DefaultUserService(UserDao userDao) {
        this.userDao = userDao;

    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        return deleteUser(id);
    }

    @Override
    public boolean addUser(User user) {
        return addUser(user);
    }

    @Override
    public void updateUser(User user) {
        updateUser(user);

    }
}
