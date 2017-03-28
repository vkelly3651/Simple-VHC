package com.example.vinneyboy.simplevhc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
/**import android.widget.RadioButton;**/

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.appindexing.FirebaseUserActions;
import com.google.firebase.appindexing.builders.Actions;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public MainActivity(DatabaseReference mDatabase) {
        this.mDatabase = mDatabase;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    //this takes the user to the start checks page in the VHC
    public void gotoNextPage(View view) {
        Intent nextPage = new Intent(MainActivity.this, StartChecks.class);
        startActivity(nextPage);

    }
    public void gotoNextPage2(View view) {
        Intent nextPage = new Intent(MainActivity.this, ThirdPage.class);
        startActivity(nextPage);

    }
    public void gotoNextPage3(View view) {
        Intent nextPage = new Intent(MainActivity.this, Reports.class);
        startActivity(nextPage);

    }
    public void gotoFirstCheckPage(View view) {
        Intent nextPage = new Intent(MainActivity.this, FirstCheckPage.class);
        startActivity(nextPage);

    }
    public void gotoSecondCheckPage(View view) {
        Intent nextPage;
        nextPage = new Intent(MainActivity.this, Second_Check_Page.class);
        startActivity(nextPage);

    }
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }
    /**public void RBClicked(View view){
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
    }**/
    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        FirebaseUserActions.getInstance().start(getIndexApiAction0());
    }

    @Override
    public void onStop() {
        super.onStop();// ATTENTION: This was auto-generated to implement the App Indexing API.
// See https://g.co/AppIndexing/AndroidStudio for more information.
        FirebaseUserActions.getInstance().end(getIndexApiAction0());

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public com.google.firebase.appindexing.Action getIndexApiAction0() {
        return Actions.newView("Main", "http://[ENTER-YOUR-URL-HERE]");
    }
}
