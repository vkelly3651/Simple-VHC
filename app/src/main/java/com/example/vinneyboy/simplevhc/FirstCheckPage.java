package com.example.vinneyboy.simplevhc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class FirstCheckPage extends AppCompatActivity {
    /**first screen with four items to check on the VHC*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_check_page);
    }
    public void RBClicked(View view){
        String userInfo="";
        boolean checked =((RadioButton) view).isChecked();

        //check buttons
        switch(view.getId()){
            case R.id.radioButton:
                if (checked)
                    userInfo = "Green";
                break;
            case R.id.radioButton2:
                if (checked)
                    userInfo = "Amber";
                break;
            case R.id.radioButton3:
                if (checked)
                    userInfo = "Red";
                break;
            case R.id.radioButton4:
                if (checked)
                    userInfo = "Not Checked";
                break;
        }
    }
    public void gotoSecondCheckPage(View view) {
        Intent nextPage = new Intent(FirstCheckPage.this, Second_Check_Page.class);
        startActivity(nextPage);
    }
}
