package com.saleshub.wirelessnow.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.saleshub.wirelessnow.R;

public class ActivityLogin extends Activity {
    TextView tv_login,tv_forgot_pass,tv_register;
    EditText et_username,et_password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_l);
        findId();

        tv_forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this,ActivityForgotPassword.class);
                startActivity(intent);
            }
        });



        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (et_username.getText().toString().trim().isEmpty()){
                    Toast.makeText(ActivityLogin.this, "Please fill up username", Toast.LENGTH_SHORT).show();
                }else if (et_password.getText().toString().trim().isEmpty()){
                    Toast.makeText(ActivityLogin.this, "Please fill password", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(ActivityLogin.this,ActivityPersonalInfo.class);
                    startActivity(intent);
                }


            }
        });

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this,ActivityPersonalInfo.class);
                startActivity(intent);
            }
        });
    }

    private void findId() {
        tv_login = findViewById(R.id.tv_login);
        tv_forgot_pass = findViewById(R.id.tv_forgot_pass);
        tv_register = findViewById(R.id.tv_register);
    }
}
