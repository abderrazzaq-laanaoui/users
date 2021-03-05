package codes.laanoui.users.presentation.actions;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.List;

import codes.laanoui.users.R;
import codes.laanoui.users.models.User;
import codes.laanoui.users.presentation.controllers.AddActivity;
import codes.laanoui.users.presentation.controllers.MainActivity;
import codes.laanoui.users.utils.MyContext;

public class BtnsAction  implements View.OnClickListener{
    private AppCompatActivity app;

    public BtnsAction( AppCompatActivity app) {
        this.app = app;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add_button:
                Intent intent = new Intent(app.getApplicationContext(), AddActivity.class);
                app.startActivity(intent);
                break;
            case R.id.val_button:
                String name = ((TextView) app.findViewById(R.id.name_input)).getText().toString().trim();
                String userName = ((TextView) app.findViewById(R.id.user_name_input)).getText().toString().trim();
                String mail = ((TextView) app.findViewById(R.id.mail_input)).getText().toString().trim();

                if(name == "" || userName == "" || mail == ""){
                    Toast.makeText(app.getApplicationContext(), "Merci de verifier les infos!", Toast.LENGTH_SHORT).show();
                }
                else{
                    List<User> users = ((MyContext)app.getApplicationContext()).getServices().getUsers();
                    users.add(new User(users.size()+1,name,userName,mail));
                    Intent i = new Intent(app.getApplicationContext(), MainActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    app.startActivity(i);
                    app.finish();
                    ((MyContext)app.getApplicationContext()).getMainActivity().getCustomerAdapter().notifyDataSetChanged();

                }
        }

        }
    }



