package se.koolsport.hangmanpat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static se.koolsport.hangmanpat.R.id.tries;

/**
 * Created by patrikrikamahinnenberg on 01/11/17.
 */

public class ResultActivity  extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        String Result = intent.getStringExtra("Result");
        TextView re = (TextView) findViewById(R.id.resultText);
        re.setText(Result);

        String theWord = intent.getStringExtra("theWord");
        TextView tw = (TextView) findViewById(R.id.theWord);
        tw.setText(theWord);

        int trys = intent.getIntExtra("triesA", 10);
        TextView tr = (TextView) findViewById(tries);
        tr.setText("Guesses left " + String.valueOf(trys));

    }


    public void backToMenu (View view) {
        Intent backtomenu = new Intent(this, MainActivity.class);
        backtomenu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(backtomenu);
    }


}
