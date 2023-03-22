package com.example.yasmanicampos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnsuma;
    Button btnresta;
    Button btnMult;
    Button btnDiv;

    EditText num1;
    EditText num2;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 =(EditText) findViewById(R.id.numero1);
        num2 =(EditText) findViewById(R.id.numero2);
        Resultado=(TextView) findViewById(R.id.resultado);
        btnsuma =(Button)findViewById(R.id.button_suma);
        btnsuma.setOnClickListener(this);
        btnresta =(Button)findViewById(R.id.button_resta);
        btnresta.setOnClickListener(this);
        btnMult =(Button)findViewById(R.id.button_multiplicacion);
        btnMult.setOnClickListener(this);
        btnDiv =(Button)findViewById(R.id.button_division);
        btnDiv.setOnClickListener(this);


        @Override
              public void onClick(View v ){
            int numero1 =Integer.parseInt(num1.getText().toString());
            int numero2 =Integer.parseInt(num2.getText().toString());
            int Resultado =0;

            Switch(v.getId()) {
                case R.id.button_suma;
                    Resultado = numero1 + numero2;
                    break;
                case
                case R.id.button_resta;
                    Resultado = numero1 - numero2;
                    break;
                case R.id.button_multiplicacion;
                    Resultado = numero1 * numero2;
                    break;
                case R.id.button_division;
                    Resultado = numero1 / numero2;
                    break;
            }
            Resultado.setText("" + Resultado);
            }
        }



    }
