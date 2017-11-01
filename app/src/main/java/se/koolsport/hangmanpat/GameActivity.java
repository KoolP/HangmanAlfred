package se.koolsport.hangmanpat;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import se.koolsport.hangmanpat.hangman.Hangman;

public class GameActivity extends AppCompatActivity {

    private TextView playerName;
    private EditText userInput;
    private Hangman hangman;
    //skapa variabel påarray
    private TypedArray pictures;
    private ImageView changePicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        playerName = (TextView) findViewById(R.id.textView4);

        Intent intent = getIntent();

        String recievedName = intent.getStringExtra("Nameofplayer");

        playerName.setText(recievedName);

        hangman = new Hangman();

        TextView showMysteryLetters = (TextView)findViewById(R.id.hiddenWord);
        showMysteryLetters.setText(hangman.getMaskedWord());


        //Skapa arrayn av bilder från xml
        pictures = getResources().obtainTypedArray(R.array.pictures);

    }

    public void guessButton(View view) {
        userInput = (EditText) findViewById(R.id.userInput);
        hangman.makeGuess(userInput.getText().charAt(0));

        TextView showMysteryLetters = (TextView)findViewById(R.id.hiddenWord);
        showMysteryLetters.setText(hangman.getMaskedWord());

        //Empties letter in input field
        userInput.setText(" ");


        //create textview and typcast
        TextView missedChar = (TextView)findViewById(R.id.lettersGuessed);
        //Place to value textview
        missedChar.setText(String.valueOf(hangman.getLetterList()));

        changePicture = (ImageView)findViewById(R.id.hangImage);
        changePicture.setImageResource(pictures.getResourceId(hangman.getA(), 0));

        TextView triesCount = (TextView)findViewById(R.id.triesText);
        //add text to tryCount, from ten down
        triesCount.setText("Tries left " + (10-hangman.getA()));


        if(hangman.isWin()) {
            Intent i = new Intent(this, ResultActivity.class);
            i.putExtra("Result", "You Survive");
            i.putExtra("theWord", hangman.getMysteryWord());
            i.putExtra("triesA", (10-hangman.getA()));

            startActivity(i);


        } else if (hangman.getA () == 10) {
            Intent i = new Intent(this, ResultActivity.class);
            i.putExtra("Result", "You are Executed");
            i.putExtra("theWord", hangman.getMysteryWord());
            i.putExtra("triesA", (10-hangman.getA()));

            startActivity(i);
        }


    }

}
