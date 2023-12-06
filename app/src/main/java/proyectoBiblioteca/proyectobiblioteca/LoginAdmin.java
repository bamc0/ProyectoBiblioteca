package proyectoBiblioteca.proyectobiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectobiblioteca.R;

public class LoginAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
    }

    public void cambiarACliente(View v){
        Intent sig = new Intent(this, MainActivity.class);
        startActivity(sig);
    }

    public void IntentarEntrar(View v){
        if (true/*To do: Validación de ID y Contraseña*/){
            irAMenu();
        }else
            Toast.makeText(LoginAdmin.this, "ID o Contraseña inválido", Toast.LENGTH_SHORT).show();
    }

    public void irAMenu(){
        Intent sig = new Intent(this, MenuAdmin.class);
        startActivity(sig);
    }
}