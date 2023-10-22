package com.example.atividade04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSoma, btnSubtracao, btnMultiplicacao, btnDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSoma = findViewById(R.id.btnSoma);
        btnDivisao = findViewById(R.id.btnDivisao);
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnSubtracao = findViewById(R.id.btnSubtracao);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ActivitySoma.class);
                startActivity(it);
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ActivitySubtracao.class);
                startActivity(it);
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ActivityDivisao.class);
                startActivity(it);
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ActivityMultiplicacao.class);
                startActivity(it);
            }
        });
    }




}