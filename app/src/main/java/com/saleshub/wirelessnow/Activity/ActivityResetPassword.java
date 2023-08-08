package com.saleshub.wirelessnow.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.saleshub.wirelessnow.R;

public class ActivityResetPassword extends Activity {

    TextView tv_send_code;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_reset_password_);
        bindId();

        tv_send_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityResetPassword.this,ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });



    }

    private void bindId() {
        tv_send_code = findViewById(R.id.tv_send_code);
    }
}