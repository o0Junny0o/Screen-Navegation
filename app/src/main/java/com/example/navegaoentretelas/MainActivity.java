package com.example.navegaoentretelas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent in = getIntent();
        int vl_recebido = Integer.parseInt(in.getStringExtra("valor"));
        num = vl_recebido;
        updateNum();
    }

    public void updateNum(){
        TextView numValue = findViewById(R.id.textnum);
        numValue.setText(num + "");
    }

    public void setOverNum(View view) {
        num++;
        updateNum();
    }

    public void setUnderNum(View view) {
        num--;
        updateNum();
    }


    public void changeBgto1(View view) {
        View rootView = findViewById(android.R.id.content); // Obtém a View raiz
        rootView.setBackgroundColor(Color.parseColor("#9C27B0"));
    }

    public void changeBgto2(View view) {
        View rootView = findViewById(android.R.id.content); // Obtém a View raiz
        rootView.setBackgroundColor(Color.parseColor("#673AB7"));
    }

    public void changeBgto3(View view) {
        View rootView = findViewById(android.R.id.content); // Obtém a View raiz
        rootView.setBackgroundColor(Color.parseColor("#00BCD4"));
    }

    public void nextPage(View view) {
        Intent in = new Intent(MainActivity.this, Page2Activity.class);
        in.putExtra("valor",num);
        startActivity(in);
    }
}