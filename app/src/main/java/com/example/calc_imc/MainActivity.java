package com.example.calc_imc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editAltura, editPeso;
    TextView resultado;
    RadioButton sexoF, sexoM;
    double peso = 0.0;
    double altura = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);
        resultado = findViewById(R.id.resultado);
        sexoF = findViewById(R.id.rdnF);
        sexoM = findViewById(R.id.rdnM);
    }

    public void imc(View view){
        peso = Double.parseDouble(editPeso.getText().toString());
        altura = Double.parseDouble(editAltura.getText().toString());
        double result = peso / (altura * altura);

        if(sexoF.isChecked()){
            if(result < 19){
                resultado.setText("Abaixo do Normal");
            }else if(result >= 19 && result <= 23.9){
                resultado.setText("Normal");
            }else if(result >= 24 && result <= 28.9){
                resultado.setText("Obesidade Leve");
            }else if(result >= 29 && result <= 38.9){
                resultado.setText("Obesidade Moderada");
            }else if(result >= 39){
                resultado.setText("Obesidade Mórbida");
            }

        }

        else if(sexoF.isChecked() == false && sexoM.isChecked() == true){
            if(result < 20){
                resultado.setText("Abaixo do Normal");
            }else if(result >= 20 && result <= 24.9){
                resultado.setText("Normal");
            }else if(result >= 25 && result <= 29.9){
                resultado.setText("Obesidade Leve");
            }else if(result >= 30 && result <= 39.9){
                resultado.setText("Obesidade Moderada");
            }else if(result >= 40){
                resultado.setText("Obesidade Mórbida");
            }

        }

    }

}