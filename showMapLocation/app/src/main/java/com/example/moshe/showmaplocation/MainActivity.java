package com.example.moshe.showmaplocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        String button_text;

        button_text = ((Button) view).getText().toString();
        if(button_text.equals("go to map"))
        {
            Intent intent = new Intent(this, MapsActivity.class);
            startActivity(intent);

        }

    }

}