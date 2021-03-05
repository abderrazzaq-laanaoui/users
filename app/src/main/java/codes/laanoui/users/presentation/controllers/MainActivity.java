package codes.laanoui.users.presentation.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import codes.laanoui.users.R;
import codes.laanoui.users.models.User;
import codes.laanoui.users.presentation.actions.BtnsAction;
import codes.laanoui.users.utils.CustomUserAdapter;
import codes.laanoui.users.utils.MyContext;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Button addBtn;
    CustomUserAdapter customerAdapter;

    public CustomUserAdapter getCustomerAdapter() {
        return customerAdapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyContext) getApplicationContext()).setMainActivity(this);
        BtnsAction clickHandler = new BtnsAction(this);
        MyContext context = (MyContext) getApplicationContext();
        List<User> users = context.getServices().getUsers();

        listView = findViewById(R.id.liste);
         customerAdapter = new CustomUserAdapter((MyContext)this.getApplicationContext());
        listView.setAdapter(customerAdapter);

        addBtn = (Button) findViewById(R.id.add_button);
        addBtn.setOnClickListener(clickHandler);
    }
}