package com.heltonbustos.ejemplocallback01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUser, txtPass;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        txtUser = findViewById(R.id.txtUser);
        txtPass = findViewById(R.id.txtPass);

    }

    public void loginUsuario(View view){
        String user = txtUser.getText().toString();
        String pass = txtPass.getText().toString();

        x = new Login().verificar(user, pass, new InterfaceCallback() {
            @Override
            public void segundoMetodo() {
                if(x == 1){
                    Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "No existe", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}