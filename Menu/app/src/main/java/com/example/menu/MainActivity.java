package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
            Intent intent = new Intent(getApplicationContext(),RegistroActivity.class);
            startActivity(intent);
            return true;

        }

        return super.onOptionsItemSelected(item);



    }
}