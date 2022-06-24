package com.example.calc_imc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editAltura, editPeso;
    TextView resultado;
    double peso = 0.0;
    double altura = 0.0;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);
        resultado = findViewById(R.id.resultado);
    }

    public void imc(View view){
        peso = Double.parseDouble(editPeso.getText().toString());
        altura = Double.parseDouble(editAltura.getText().toString());
        double result = peso / (altura * altura);

        resultado.setText(Double.valueOf(result).toString());
    }

}