package com.example.vinneyboy.simplevhc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second_Check_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__check__page);
    }
    public void gotoThirdCheckPage(View view) {
        Intent nextPage = new Intent(Second_Check_Page.this, Third_Check_Page.class);
        startActivity(nextPage);
    }
}
