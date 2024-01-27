package dev.android.bruno.imcapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import dev.android.bruno.imcapplication.R;

public class MainActivity extends AppCompatActivity {

    EditText editNome;
    EditText editSobrenome;
    EditText editAltura;
    EditText editPeso;
    Button btnCalc;

    Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarTelaResultado();
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editAltura.setText("");
                editPeso.setText("");
            }
        });

    }

    public void mostrarTelaResultado() {
        if (TextUtils.isEmpty(editNome.getText().toString())){
            editNome.setError("Campo Obrigatório!");
            return;
        }
        if (TextUtils.isEmpty(editSobrenome.getText().toString())){
            editSobrenome.setError("Campo obrigatório!");
            return;
        }
        if (TextUtils.isEmpty(editAltura.getText().toString())){
            editAltura.setError("Campo obrigatório!");
            return;
        }
        if (TextUtils.isEmpty(editPeso.getText().toString())){
            editPeso.setError("Campo obrigatório!");
            return;
        }

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("editNome",editNome.getText().toString());
        intent.putExtra("editSobrenome",editSobrenome.getText().toString());
        intent.putExtra("editAltura",editAltura.getText().toString());
        intent.putExtra("editPeso",editPeso.getText().toString());
        startActivity(intent);
    }
}