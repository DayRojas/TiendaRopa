package com.example.tiendaropa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void info_Hombre (View view) {
        Intent i=new Intent(this, infoHombre.class);
        startActivity(i);
    }
    public void info_Mujer (View view) {
        Intent intention=new Intent(this, infoMujer.class);
        startActivity(intention);
    }
    public void info_Niño (View view) {
        Intent intent=new Intent(this, infoNiño.class);
        startActivity(intent);
    }


}