package com.example.myapplicationapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0; // Contador inicializado en 0
    private TextView mShowCount; // TextView para mostrar el contador

    private static final String COUNT_KEY = "count"; // Clave para almacenar el contador en el Bundle

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Método que se llama cuando se crea la actividad
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Establece el diseño de la actividad

        mShowCount = (TextView) findViewById(R.id.show_count); // Obtiene una referencia al TextView

        if (savedInstanceState != null) { // Comprueba si hay datos guardados
            mCount = savedInstanceState.getInt(COUNT_KEY); // Recupera el valor del contador guardado
            mShowCount.setText(String.valueOf(mCount)); // Actualiza el TextView con el valor del contador
        }
    }

    public void countUp(View view) { // Método que se llama cuando se hace clic en el botón
        mCount++; // Incrementa el contador
        mShowCount.setText(String.valueOf(mCount)); // Actualiza el TextView con el valor del contador
    }

    @Override
    public void onSaveInstanceState(Bundle outState) { // Método que se llama antes de que la actividad sea destruida
        super.onSaveInstanceState(outState);
        outState.putInt(COUNT_KEY, mCount); // Guarda el valor del contador en el Bundle
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) { // Método que se llama después de que la actividad sea recreada
        super.onRestoreInstanceState(savedInstanceState);
        mCount = savedInstanceState.getInt(COUNT_KEY); // Recupera el valor del contador guardado
        mShowCount.setText(String.valueOf(mCount)); // Actualiza el TextView con el valor del contador
    }
}
