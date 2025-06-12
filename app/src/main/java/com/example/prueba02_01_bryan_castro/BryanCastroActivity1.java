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
                Intent intent = new Intent(getApplicationContext(),BryanCastroActivity2.class);
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

            }
        });
        }

    public int ParteEntera(int dividendo, int divisor) {
        int parteEntera = dividendo / divisor;
        return parteEntera;
    }
    }