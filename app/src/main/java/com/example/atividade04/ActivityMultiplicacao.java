package com.example.atividade04;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityMultiplicacao extends AppCompatActivity {

    EditText editMultiplicar1, editMultiplicar2;
    TextView editResult;
    Button buttonSomar;

    String soma;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);

        editMultiplicar1 = findViewById(R.id.editMultiplicar1);
        editMultiplicar2 = findViewById(R.id.editMultiplicar2);
        buttonSomar = findViewById(R.id.buttonSomar);
        editResult = findViewById(R.id.editResult);

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Double.parseDouble(editMultiplicar1.getText().toString());
                double valor2 = Double.parseDouble(editMultiplicar2.getText().toString());
                soma = String.valueOf(valor1*valor2);
                editResult.setText(soma);
            }
        });

    }
}