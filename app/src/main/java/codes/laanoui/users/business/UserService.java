package codes.laanoui.users.business;

import java.util.List;

import codes.laanoui.users.models.User;

public interface UserService {
    public User getUser(int id);
    public List<User> getUsers();
    public boolean deleteUser(int id);
    public boolean addUser(User user);
    public void updateUser(User user);
}
