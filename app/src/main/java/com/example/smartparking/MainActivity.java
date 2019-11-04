package com.example.smartparking;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

 import com.example.smartparking.GuestLoginActivity;
 import com.example.smartparking.LoginActivity;
import com.example.smartparking.R;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private TextView admin,user,guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin=findViewById(R.id.admin_login_button);
        user= findViewById(R.id.user_login_button);
        guest=findViewById(R.id.guest);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                i.putExtra("title","User");
                startActivity(i);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                i.putExtra("title","Admin");
                startActivity(i);

            }
        });

        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, GuestLoginActivity.class);
                startActivity(i);
            }
        });
    }
}