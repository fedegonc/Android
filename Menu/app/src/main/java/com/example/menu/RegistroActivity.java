package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        getSupportActionBar().setTitle("Registro");

        final EditText et_registro_cedula = findViewById(R.id.et_registro_cedula);
        final EditText et_registro_nombre = findViewById(R.id.et_registro_nombre);
        Button btn_registro_guardar = findViewById(R.id.btn_registro_guardar);
        Button btn_registro_guardar_perfil = findViewById(R.id.btn_registro_guardar_perfil);
        Button btn_registro_ver_lista = findViewById(R.id.btn_registro_ver_lista);


        ArrayList<Usuario> lista_usuario = new ArrayList<>();

        btn_registro_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cedula_usuario = et_registro_cedula.getText().toString();
                String nombre_usuario = et_registro_nombre.getText().toString();

                if(cedula_usuario.isEmpty() || nombre_usuario.isEmpty()){
                    Toast.makeText(RegistroActivity.this,"Los campos son obligatorios" ,Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(RegistroActivity.this,"Validando  campos..." ,Toast.LENGTH_SHORT).show();
                    Toast.makeText(RegistroActivity.this,"Hola" +nombre_usuario ,Toast.LENGTH_LONG).show();

                    Usuario mi_usuario = new Usuario(cedula_usuario, nombre_usuario);
                    lista_usuario.add(mi_usuario);

                }

            }
        });

        btn_registro_guardar_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cedula_usuario = et_registro_cedula.getText().toString();
                String nombre_usuario = et_registro_nombre.getText().toString();

                if(cedula_usuario.isEmpty() || nombre_usuario.isEmpty()){
                    Toast.makeText(RegistroActivity.this,"Los campos son obligatorios" ,Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(RegistroActivity.this, "Validando  campos...", Toast.LENGTH_SHORT).show();
                    Toast.makeText(RegistroActivity.this, "Hola" + nombre_usuario, Toast.LENGTH_LONG).show();

                    Usuario mi_usuario = new Usuario(cedula_usuario, nombre_usuario);
                    lista_usuario.add(mi_usuario);
                    Intent inten_perfil = new Intent(RegistroActivity.this,PerfilActivity.class);
                    inten_perfil.putExtra("perfil",mi_usuario);
                    startActivity(inten_perfil);
                }


            }
        });
        btn_registro_ver_lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_lista = new Intent(RegistroActivity.this, ListaActivity.class);
                intent_lista.putExtra("lista", lista_usuario);
                startActivity(intent_lista);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


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
            Intent intent = new Intent(getApplicationContext(), RegistroActivity.class);
            startActivity(intent);
            return true;

        }

        return super.onOptionsItemSelected(item);

    }
}