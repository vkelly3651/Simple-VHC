package com.example.vinneyboy.simplevhc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third_Check_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__check__page);
    }
    public void gotoFourthCheckScreen(View view) {
        Intent nextPage = new Intent(Third_Check_Page.this, FourthCheckScreen.class);
        startActivity(nextPage);}
}
