package com.example.atividade04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDivisao extends AppCompatActivity {

    EditText editDividir1, editDividir2;
    TextView editResult;
    Button buttonSomar;

    String soma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao);

        editDividir1 = findViewById(R.id.editDividir1);
        editDividir2 = findViewById(R.id.editDividir2);
        buttonSomar = findViewById(R.id.buttonSomar);
        editResult = findViewById(R.id.editResult);

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Double.parseDouble(editDividir1.getText().toString());
                double valor2 = Double.parseDouble(editDividir2.getText().toString());
                soma = String.valueOf(valor1 / valor2);
                editResult.setText(soma);
            }
        });

    }
}