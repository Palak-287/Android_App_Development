package com.saleshub.wirelessnow.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.saleshub.wirelessnow.R;

public class ActivityPersonalInfo extends Activity {

    LinearLayout ll_continue_one,ll_continue_two,ll_continue_four,ll_continue_five,ll_continue_seven;
    LinearLayout ll_back_one,ll_back_two,ll_back_four,ll_back_five,ll_back_seven;
    LinearLayout layout_one,layout_two,layout_four,layout_five,layout_seven;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_personal_info);
        findId();

        ll_continue_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.VISIBLE);
                layout_four.setVisibility(View.GONE);
                layout_five.setVisibility(View.GONE);
                layout_seven.setVisibility(View.GONE);
            }
        });

        ll_continue_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.GONE);
                layout_four.setVisibility(View.VISIBLE);
                layout_five.setVisibility(View.GONE);
                layout_seven.setVisibility(View.GONE);
            }
        });

        ll_continue_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.GONE);
                layout_four.setVisibility(View.GONE);
                layout_five.setVisibility(View.VISIBLE);
                layout_seven.setVisibility(View.GONE);
            }
        });

        ll_continue_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.GONE);
                layout_four.setVisibility(View.GONE);
                layout_five.setVisibility(View.GONE);
                layout_seven.setVisibility(View.VISIBLE);
            }
        });
        ll_back_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.GONE);
                layout_four.setVisibility(View.GONE);
                layout_five.setVisibility(View.VISIBLE);
                layout_seven.setVisibility(View.GONE);
            }
        });


        ll_back_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.GONE);
                layout_four.setVisibility(View.VISIBLE);
                layout_five.setVisibility(View.GONE);
                layout_seven.setVisibility(View.GONE);
            }
        });


        ll_back_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.VISIBLE);
                layout_four.setVisibility(View.GONE);
                layout_five.setVisibility(View.GONE);
                layout_seven.setVisibility(View.GONE);
            }
        });


        ll_back_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_one.setVisibility(View.VISIBLE);
                layout_two.setVisibility(View.GONE);
                layout_four.setVisibility(View.GONE);
                layout_five.setVisibility(View.GONE);
                layout_seven.setVisibility(View.GONE);
            }
        });

        ll_continue_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityPersonalInfo.this,ActivityOrderSucess.class);
                startActivity(intent);
            }
        });

    }

    private void findId() {
        ll_continue_one = findViewById(R.id.ll_continue_one);
        ll_continue_two = findViewById(R.id.ll_continue_two);
        ll_continue_four = findViewById(R.id.ll_continue_four);
        ll_continue_five = findViewById(R.id.ll_continue_five);
        ll_continue_seven = findViewById(R.id.ll_continue_seven);
        layout_one = findViewById(R.id.layout_one);
        layout_two = findViewById(R.id.layout_two);
        layout_four = findViewById(R.id.layout_four);
        layout_five = findViewById(R.id.layout_five);
        layout_seven = findViewById(R.id.layout_seven);
        ll_back_one = findViewById(R.id.ll_back_one);
        ll_back_two = findViewById(R.id.ll_back_two);
        ll_back_four = findViewById(R.id.ll_back_four);
        ll_back_five = findViewById(R.id.ll_back_five);
        ll_back_seven = findViewById(R.id.ll_back_seven);
    }
}
