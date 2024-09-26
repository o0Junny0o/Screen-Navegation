package com.example.navegaoentretelas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Page2Activity extends AppCompatActivity {
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent in = getIntent();
        String vl_recebido = in.getStringExtra("vl_enviado");
        TextView text2 = findViewById(R.id.textnum);
        text2.setText(vl_recebido + "");
    }

    public void updateNum(){
        TextView numValue = findViewById(R.id.textnum);
        numValue.setText(num + "");
    }

    public void setUnderNum(View view) {
        num--;
        updateNum();
    }

    public void setOverNum(View view) {
        num++;
        updateNum();
    }

    public void changeBgto1(View view) {
        View rootView = findViewById(android.R.id.content); // Obtém a View raiz
        rootView.setBackgroundColor(Color.parseColor("#2196F3"));
    }

    public void changeBgto2(View view) {
        View rootView = findViewById(android.R.id.content); // Obtém a View raiz
        rootView.setBackgroundColor(Color.parseColor("#03A9F4"));
    }

    public void changeBgto3(View view) {
        View rootView = findViewById(android.R.id.content); // Obtém a View raiz
        rootView.setBackgroundColor(Color.parseColor("#3F51B5"));
    }

    public void returnPage(View view) {
        Intent in = new Intent(Page2Activity.this, MainActivity.class);
        in.putExtra("valor",num);
        startActivity(in);
    }
}