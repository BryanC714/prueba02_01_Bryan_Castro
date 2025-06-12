package com.example.prueba02_01_bryan_castro;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BryanCastroActivity3 extends AppCompatActivity {
private EditText editTextNombresP3;
private EditText editTextApellidoP3;
private EditText editTextDividendop3;
private EditText editTextDivisorP3;
private EditText editTextNumeroP3;
private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bryan_castro3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextNombresP3=findViewById(R.id.editTextNombresP3);
        editTextApellidoP3=findViewById(R.id.editTextApellidoP3);
        editTextDividendop3=findViewById(R.id.editTextDividendop3);
        editTextDivisorP3=findViewById(R.id.editTextDivisorP3);
        button3=findViewById(R.id.button3);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String Nombresp2 = extras.getString("Nombresp2");
            String ApellidosP2 = extras.getString("ApellidosP2");
        }


    }
}