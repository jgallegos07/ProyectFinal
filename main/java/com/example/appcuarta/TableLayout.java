package com.example.appcuarta;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class TableLayout extends AppCompatActivity {
    private int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
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
    public void num1(View vista){
        contador=contador+1;
        mostrar();
    }
    public void num2(View vista){
        contador=contador+2;
        mostrar();
    }
    public void num3(View vista){
        contador=contador+3;
        mostrar();
    }
    public void num4(View vista){
        contador=contador+4;
        mostrar();
    }
    public void num5(View vista){
        contador=contador+5;
        mostrar();
    }
    public void num6(View vista){
        contador=contador+6;
        mostrar();
    }
    public void num7(View vista){
        contador=contador+7;
        mostrar();
    }
    public void num8(View vista){
        contador=contador+8;
        mostrar();
    }
    public void num9(View vista){
        contador=contador+9;
        mostrar();
    }
    public void num0(View vista){
        contador=contador+0;
        mostrar();
    }

    public void mostrar(){
        TextView texto = (TextView)findViewById(R.id.textView);
        texto.setText(""+contador);
    }

}
