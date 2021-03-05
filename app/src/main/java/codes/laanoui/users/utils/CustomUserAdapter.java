package codes.laanoui.users.utils;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import codes.laanoui.users.R;
import codes.laanoui.users.models.User;

import java.util.List;

public class CustomUserAdapter  extends BaseAdapter {
    private MyContext context;
    private List<User> users;
    private LayoutInflater layoutInflater;
    public CustomUserAdapter(Application context){
        this.context= (MyContext) context;
        users=this.context.getServices().getUsers();
        layoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return users.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
            convertView=layoutInflater.inflate(R.layout.custom_user_item,null);

        TextView name= convertView.findViewById(R.id.name);
        TextView user_name= convertView.findViewById(R.id.user_name);
        TextView email= convertView.findViewById(R.id.email);
        name.setText(users.get(position).getUserName());
        user_name.setText(users.get(position).getNom());
        email.setText(users.get(position).getMail());
        return convertView;
    }
    public void updateReceiptsList(List<User> newlist) {
        users.clear();
        users.addAll(newlist);
        this.notifyDataSetChanged();
    }
}
