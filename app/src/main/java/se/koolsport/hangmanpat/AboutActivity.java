package se.koolsport.hangmanpat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);

        //Trying to make actionbar hide on click, should it be here?
        //ActionBar actionbar = getSupportActionBar();
        //actionbar.hide();

        //Trying to infate menu
        //@Override
        //        public boolean onCreateOptionsMenu(Menu menu) {
        //        getMenuInflater().inflate()(R.menu.image..)
        //}

        //Trying to create clickable
        //@Override
        //public boolean onOptionsItemSelected(MenuItems) {
        //        if (item.getItemId() == R.id.menu_alt1)
        //}

    }
}
