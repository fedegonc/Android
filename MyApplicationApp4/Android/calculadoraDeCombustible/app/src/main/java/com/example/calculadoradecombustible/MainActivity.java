package com.example.calculadoradecombustible;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText distanceEditText;
    private EditText autonomyEditText;
    private EditText priceEditText;
    private Button calculateButton; // Declaración de la variable Button
    private TextView resultTextView; // Declaración de la variable TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distanceEditText = findViewById(R.id.distancia);
        autonomyEditText = findViewById(R.id.autonomia);
        priceEditText = findViewById(R.id.precio);
        calculateButton = findViewById(R.id.calcularBtn); // Asignación del botón a la variable
        resultTextView = findViewById(R.id.resultado); // Asignación del TextView a la variable

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double distancia = Double.parseDouble(distanceEditText.getText().toString());
                double autonomia = Double.parseDouble(autonomyEditText.getText().toString());
                double precio = Double.parseDouble(priceEditText.getText().toString());

                double coste = (distancia / autonomia) * precio;

                resultTextView.setText("El coste del viaje es: " + coste + " pesos.");
            }
        });
    }
}
