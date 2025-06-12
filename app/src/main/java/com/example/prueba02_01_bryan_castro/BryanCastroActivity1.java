package com.example.prueba02_01_bryan_castro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BryanCastroActivity1 extends AppCompatActivity {
    private EditText editTextNombres;
    private EditText editTextApellidos;
    private EditText editTextDividendo;
    private EditText editTextDivisor;
    private EditText editTextParteEntera ;
    private EditText editTextResiduo;
    private EditText editTextNumeroInvertido ;
    private Button buttonMostrar;
    private Button buttonSiguiente;
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
        editTextNombres=findViewById(R.id.editText_Nombres);
        editTextApellidos=findViewById(R.id.editText_Apellidos);
        editTextDividendo=findViewById(R.id.editText_Dividendo);
        editTextDivisor=findViewById(R.id.editTextDivisor);
        editTextParteEntera=findViewById(R.id.editTextParteEntera);
        editTextResiduo=findViewById(R.id.editTextResiduo);
        editTextNumeroInvertido=findViewById(R.id.editTextNumeroI);
        buttonMostrar=findViewById(R.id.buttonMostrar);
        buttonSiguiente=findViewById(R.id.buttonSp1);

        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dividendo=editTextDividendo.getText().toString();
                String divisor=editTextDivisor.getText().toString();
                String numero=editTextNumeroInvertido.getText().toString();
                Intent intent = new Intent(getApplicationContext(),BryanCastroActivity2.class);
                intent.putExtra(dividendo,"Dividendo");
                intent.putExtra(divisor,"Divisor");
                intent.putExtra(numero,"Numero");
                startActivity(intent);
            }

        });
        buttonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = getIntent().getExtras();
                String Nombres=extras.getString("NombresP3");
                String Apellidos=extras.getString("ApellidoP3");
                String Dividendo=extras.getString("Dividendop3");
                String Divisor=extras.getString("DivisorP3");
                String Numero=extras.getString("NumeroP3");
                editTextNombres.setText(Nombres);
                editTextApellidos.setText(Apellidos);
                editTextDividendo.setText(Dividendo);
                editTextDivisor.setText(Divisor);
                editTextParteEntera.setText(String.valueOf(Castro_ParteEntera(Integer.parseInt(Dividendo),Integer.parseInt(Divisor))));
                editTextResiduo.setText(String.valueOf(Castro_Residuo(Integer.parseInt(Dividendo),Integer.parseInt(Divisor))));
                editTextNumeroInvertido.setText(String.valueOf(Castro_NumeroInvertido(Integer.parseInt(Numero))));
            }
        });
        }

    public int Castro_ParteEntera(int dividendo, int divisor) {
        int parteEntera = dividendo / divisor;
        return parteEntera;
    }
    public int Castro_Residuo(int dividendo, int divisor){
        return dividendo % divisor;
    }

    public int Castro_NumeroInvertido(int numero){
        int numeroInvertido = 0;
        while (numero != 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero /= 10;
        }
        return numeroInvertido;
    }
    }