package com.example.atividade04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;


public class ActivitySoma extends AppCompatActivity {

    EditText editSomar1, editSomar2;
    TextView editResult;
    Button buttonSomar;

    String soma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        editSomar1 = findViewById(R.id.editDiminuir1);
        editSomar2 = findViewById(R.id.editDiminuir2);
        buttonSomar = findViewById(R.id.buttonSomar);
        editResult = findViewById(R.id.editResult);

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Double.parseDouble(editSomar1.getText().toString());
                double valor2 = Double.parseDouble(editSomar2.getText().toString());
                soma = String.valueOf(valor1+valor2);
                editResult.setText(soma);
            }
        });

    }
}