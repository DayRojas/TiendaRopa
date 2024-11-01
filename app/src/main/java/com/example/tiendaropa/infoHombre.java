package com.example.tiendaropa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class infoHombre extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info1);

    }
    public void regresar (View view) {
        Intent intento=new Intent(this, MainActivity.class);
        startActivity(intento);
    }
}
