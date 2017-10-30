package se.koolsport.hangmanpat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import se.koolsport.hangmanpat.hangman.Hangman;

public class GameActivity extends AppCompatActivity {

    private TextView playerName;
    private EditText userInput;
    private Hangman hangman;
    private ArrayList<String> letterList;

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

        //Create ArrayList
        letterList = new ArrayList<>();

    }

    public void guessButton(View view) {
        userInput = (EditText) findViewById(R.id.userInput);
        hangman.makeGuess(userInput.getText().charAt(0));

        TextView showMysteryLetters = (TextView)findViewById(R.id.hiddenWord);
        showMysteryLetters.setText(hangman.getMaskedWord());

        //Empties letter in input field
        userInput.setText(" ");

        //add chars to arraylist from another class and getmethod, ändrar char till string
        letterList.add(String.valueOf(hangman.getGuessedLetter()));

        //create textview and typcast
        TextView missedChar = (TextView)findViewById(R.id.lettersGuessed);
        //Place to value textview
        missedChar.setText(String.valueOf(letterList));

    }



}
