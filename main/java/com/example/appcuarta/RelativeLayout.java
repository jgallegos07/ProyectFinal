package com.example.appcuarta;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void ejecutar_table_layout(View vista){
        Intent i=new Intent(this,TableLayout.class);
        startActivity(i);
    }
    public void onClickc(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"C", Toast.LENGTH_SHORT).show();
    }
    public void onClickn(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"N", Toast.LENGTH_SHORT).show();
    }
    public void onClicks(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"S", Toast.LENGTH_SHORT).show();
    }
    public void onClickne(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"NE", Toast.LENGTH_SHORT).show();
    }
    public void onClickse(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"SE", Toast.LENGTH_SHORT).show();
    }public void onClicke(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"E", Toast.LENGTH_SHORT).show();
    }public void onClickno(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"NO", Toast.LENGTH_SHORT).show();
    }
    public void onClickso(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"SO", Toast.LENGTH_SHORT).show();
    }
    public void onClicko(View arg0) {
        // Mostrar mensaje Toast Normal
        Toast.makeText(getApplicationContext(),"O", Toast.LENGTH_SHORT).show();
    }
}
