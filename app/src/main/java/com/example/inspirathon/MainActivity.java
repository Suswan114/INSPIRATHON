package com.example.inspirathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView notSAfeButton=(CardView) findViewById(R.id.notSafe);
        CardView dangerButton=(CardView) findViewById(R.id.danger);
        CardView linkButton=(CardView) findViewById(R.id.links);
        CardView settingsButton=(CardView) findViewById(R.id.settings);
        notSAfeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(), NotSafeActivity.class ) );
                //Call NOT SAFE ACTIVITY
            }
        });
        dangerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(), DangerActivity.class ) );
                //Call DANGER ACTIVITY
            }
        });
        linkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(), LinksActivity.class ) );
                //Call LINKS ACTIVITY
            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(), SettingsActivity.class ) );
                //Call SETTINGS ACTIVITY
            }
        });
    }
}