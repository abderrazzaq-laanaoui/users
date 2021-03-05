package codes.laanoui.users.dao;

import java.util.LinkedList;
import java.util.List;

import codes.laanoui.users.models.User;

public class MemoryUserDao implements UserDao {
    private List<User> users;

    public MemoryUserDao() {
        this.users = new LinkedList<User>();
        users.add(new User(1,"laanoui","Abderrazzaq","inawi@mail.com"));
        users.add(new User(2,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(3,"selami","oumayma","oum@mail.com"));
        users.add(new User(4,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(5,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(6,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(7,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(8,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(9,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(10,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(11,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(12,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(13,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(14,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(15,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(16,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(17,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(18,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(19,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(20,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(21,"boumaaza","oumayma","oum@mail.com"));
        users.add(new User(22,"boumaaza","oumayma","oum@mail.com"));

    }
    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public void updateUser(User user) {

    }
}
