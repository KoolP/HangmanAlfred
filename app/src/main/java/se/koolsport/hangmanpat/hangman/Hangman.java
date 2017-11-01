package se.koolsport.hangmanpat.hangman;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by patrikrikamahinnenberg on 25/10/17.
 */


public class Hangman {

    private String[] listWords;

    public String getMysteryWord() {
        return mysteryWord;
    }

    private String mysteryWord;
    private char[] guess;

    public ArrayList<String> getLetterList() {
        return letterList;
    }

    private ArrayList<String> letterList;

    public int getA() {
        return a;
    }

    private int a = 0;

    public char getGuessedLetter() {
        return guessedLetter;
    }

    private char guessedLetter = ' ';



    public Hangman () {
        letterList = new ArrayList<>();
        listWords = new String[10];
        listWords[0] = "sword";
        listWords[1] = "bishop";
        listWords[2] = "execution";
        listWords[3] = "america";
        listWords[4] = "knight";
        listWords[5] = "prisoner";
        listWords[6] = "allied";
        listWords[7] = "dragon";
        listWords[8] = "princess";
        listWords[9] = "goldenage";

        Random randGen = new Random();
        //Random number
        int idx = randGen.nextInt(10);
        mysteryWord = listWords[idx];
        guess = new char[mysteryWord.length()];
        for (int p = 0; p < mysteryWord.length(); p++)
            guess[p] = '-';
    }

        public boolean makeGuess(char playerGuess) {
            boolean hit = false;

        for (int j = 0; j < mysteryWord.length(); j++) {
            if (playerGuess == mysteryWord.charAt(j)) {
                guess[j] = playerGuess;
                hit = true;
            }
        }

            if (hit == false) {
                a++;

                //addar och char blir String
                letterList.add(String.valueOf(playerGuess));
    }

    return hit;

    }

    //resultCompare
    public boolean isWin (){
        if (!getMaskedWord().contains("-")) {
            return true;
        } return  false;

    }

    public String getMaskedWord() {
    return String.valueOf(guess);
    }


}

