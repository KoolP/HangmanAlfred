package se.koolsport.hangmanpat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlay(View v) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }


    public void onAbout(View v) {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }
}
