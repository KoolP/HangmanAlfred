package se.koolsport.hangmanpat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView playerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerName = (TextView) findViewById(R.id.textView4);

        Intent intent = getIntent();

        String recievedName = intent.getStringExtra("Nameofplayer");

        playerName.setText(recievedName);
    }


}
