package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        TextView tv_lista_resultados = findViewById(R.id.tv_lista_resultados);

        ArrayList<Usuario> lista_usuario = (ArrayList<Usuario>) getIntent().getSerializableExtra("lista");

        tv_lista_resultados.setText(lista_usuario.toString());

        String contenido = "";

        for (int i = 0; i < lista_usuario.size(); i++) {
            Usuario us = lista_usuario.get(i);

            contenido += "Usuario  #" + (i + 1)
                    + ".\nNombre: " + us.get_nombre()
                    + ".\nCédula: " + us.get_cedula()
                    + "\n---------------\n";

        }
        tv_lista_resultados.setText(contenido);
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_search) {
            Toast.makeText(getApplicationContext(), "Botao Search", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.action_refresh) {
            Toast.makeText(getApplicationContext(), "Botao Refresh", Toast.LENGTH_SHORT).show();
            return true;

        } else if (item.getItemId() == R.id.action_settings) {
            // Toast.makeText(getApplicationContext(), "Botao settings", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            return true;

        } else if (item.getItemId() == R.id.action_settings_registro) {
            // Toast.makeText(getApplicationContext(), "Botao settings", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),RegistroActivity.class);
            startActivity(intent);
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}