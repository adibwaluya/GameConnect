package de.htwberlin.gameconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view) {

        ImageView counter = (ImageView)view;            // Access the variable from the argument
        counter.setTranslationY(-1500);                 // Start from out of the screen
        counter.setImageResource(R.drawable.yellow);
        counter.animate().translationYBy(1500).rotation(3600).setDuration(300);  // return the chip
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
