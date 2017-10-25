package se.koolsport.hangmanpat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = (EditText)findViewById(R.id.editText);
    }

    public void play2(View v) {
        //start new activity
        Intent intent = new Intent(this, GameActivity.class);
        //include a message as astring. ?
        intent.putExtra("Nameofplayer",editText.getText().toString());
        intent.putExtra("nameofplayer", true);

        startActivity(intent);
    }

}
