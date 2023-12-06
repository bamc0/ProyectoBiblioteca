package proyectoBiblioteca.proyectobiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectobiblioteca.R;

public class MenuAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
    }

    public void salirAdmin(View v){
        Intent sig = new Intent(this, LoginAdmin.class);
        startActivity(sig);
    }

    public void irAnnadirLibros(View v){
        Intent sig = new Intent(this, annadirLibros.class);
        startActivity(sig);
    }
    public void irAnnadirSocios(View v){
        Intent sig = new Intent(this, annadirSocios.class);
        startActivity(sig);
    }
    public void irAnnadirPrestamos(View v){
        Intent sig = new Intent(this, annadirPrestamos.class);
        startActivity(sig);
    }

}