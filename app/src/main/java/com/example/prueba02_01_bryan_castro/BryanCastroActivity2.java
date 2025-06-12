package com.example.prueba02_01_bryan_castro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BryanCastroActivity2 extends AppCompatActivity {
private EditText editTextNombresp2;
private EditText editTextApellidosP2;
private EditText editTextDividendoP2;
private EditText editTextDivisorP2;
private EditText editTextNumeroP2;
private Button buttonSiguienteP2;
private Button buttonCerrarP2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bryan_castro2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextApellidosP2=findViewById(R.id.editTextApellidosP2);
        editTextDividendoP2=findViewById(R.id.editTextDividendoP2);
        editTextDivisorP2=findViewById(R.id.editTextDivisorP2);
        editTextNumeroP2=findViewById(R.id.editTextNumero);
        buttonSiguienteP2=findViewById(R.id.buttonSiguienteP2);
        buttonCerrarP2=findViewById(R.id.buttonCerrar);
        buttonSiguienteP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nombresp2=editTextNombresp2.getText().toString();
                String ApellidosP2=editTextApellidosP2.getText().toString();

                Intent intent = new Intent(getApplicationContext(),BryanCastroActivity3.class);
                intent.putExtra("Nombresp2",Nombresp2);
                intent.putExtra("ApellidosP2",ApellidosP2);
                startActivity(intent);
            }
        });
        Bundle extras = getIntent().getExtras();
        String dividendo = extras.getString("Dividendo");
        String divisor = extras.getString("Divisor");
        String numero = extras.getString("Numero");
        editTextDividendoP2.setText(dividendo);
        editTextDivisorP2.setText(divisor);
        editTextNumeroP2.setText(numero);
    }
}