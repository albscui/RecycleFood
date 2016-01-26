package com.uofthacks.recyclefood;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class EditPersonActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_person);

        TextView balanceText = (TextView) findViewById(R.id.textBalance);
        balanceText.setText("balance placeholder");

        TextView ratingText = (TextView) findViewById(R.id.textRating);
        ratingText.setText("rating placeholder");
    }

}
