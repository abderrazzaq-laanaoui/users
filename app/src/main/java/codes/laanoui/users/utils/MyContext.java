package codes.laanoui.users.utils;

import android.app.Application;

import codes.laanoui.users.business.*;
import codes.laanoui.users.business.UserService;
import codes.laanoui.users.dao.MemoryUserDao;
import codes.laanoui.users.presentation.controllers.MainActivity;

public class MyContext  extends Application {
    private UserService services;
    private MainActivity mainActivity ;

    public MyContext()
    {
        this.services=new DefaultUserService(new MemoryUserDao());
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }
    public UserService getServices() {
        return services;
    }
}
