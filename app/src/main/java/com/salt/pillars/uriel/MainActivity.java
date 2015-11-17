package com.salt.pillars.uriel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Hello1;
    TextView Hello2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hello1 = (TextView) findViewById(R.id.hello1);
        Hello2 = (TextView) findViewById(R.id.hello2);

        Hello1.setText("We changed the textview text");
        Hello2.setText("HELLO WORLD");

    }

}
