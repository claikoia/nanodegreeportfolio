package com.claikoia.nano.nanodegreeportfolio;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.appindexing.Action;

public class MainActivity extends AppCompatActivity
        {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify:
                Context conSpo = getApplicationContext();
                CharSequence texSpo = "Launch Spotify!";
                int durSpo = Toast.LENGTH_SHORT;
                Toast toaSpo = Toast.makeText(conSpo, texSpo, durSpo);
                toaSpo.show();
                break;

            case R.id.scores:
                Context conSco = getApplicationContext();
                CharSequence texSco = "Launch NFL Scores!";
                int durSco = Toast.LENGTH_SHORT;
                Toast toaSco = Toast.makeText(conSco, texSco, durSco);
                toaSco.show();
                break;

            case R.id.library:
                Context conLib = getApplicationContext();
                CharSequence texLib = "Launch Library!";
                int durLib = Toast.LENGTH_SHORT;
                Toast toaLib = Toast.makeText(conLib, texLib, durLib);
                toaLib.show();
                break;

            case R.id.build:
                Context conBui = getApplicationContext();
                CharSequence texBui = "Launch Build It Bigger!";
                int durBui = Toast.LENGTH_SHORT;
                Toast toaBui = Toast.makeText(conBui, texBui, durBui);
                toaBui.show();
                break;

            case R.id.xyz:
                Context conXyz = getApplicationContext();
                CharSequence texXyz = "Launch XYZ Reader!";
                int durXyz = Toast.LENGTH_SHORT;
                Toast toaXyz = Toast.makeText(conXyz, texXyz, durXyz);
                toaXyz.show();
                break;

            case R.id.capstone:
                Context conCap = getApplicationContext();
                CharSequence texCap = "Launch Capstone!";
                int durCap = Toast.LENGTH_SHORT;
                Toast toaCap = Toast.makeText(conCap, texCap, durCap);
                toaCap.show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();

        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.claikoia.nano.nanodegreeportfolio/http/host/path")
        );
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.claikoia.nano.nanodegreeportfolio/http/host/path")
        );
    }
}
