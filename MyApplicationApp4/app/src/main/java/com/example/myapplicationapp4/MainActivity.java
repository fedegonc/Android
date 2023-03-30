package com.example.myapplicationapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginbutton = findViewById(R.id.btn);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText userEditText = findViewById(R.id.user);
                EditText passwordEditText = findViewById(R.id.contrasenia);
                String user1 = userEditText.getText().toString();
                String pass1 = passwordEditText.getText().toString();

                if(user1.equals("asd") && pass1.equals("asd")){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    Bundle usuario = new Bundle();

                    usuario.putString("usr", user1);

                    intent.putExtras(usuario);

                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Usuario o contrasenia incorrectos", Toast.LENGTH_SHORT).show();;
                }

            }
        });
    }
}