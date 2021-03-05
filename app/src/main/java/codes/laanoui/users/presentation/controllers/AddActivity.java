package codes.laanoui.users.presentation.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import codes.laanoui.users.R;
import codes.laanoui.users.presentation.actions.BtnsAction;

public class AddActivity extends AppCompatActivity {

    BtnsAction clickHandler = new BtnsAction(this);
    private Button valBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Intent intent = getIntent();

        valBtn = (Button) this.findViewById(R.id.val_button);
        valBtn.setOnClickListener(clickHandler);
    }


}
