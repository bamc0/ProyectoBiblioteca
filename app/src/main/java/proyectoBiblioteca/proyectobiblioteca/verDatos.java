package proyectoBiblioteca.proyectobiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectobiblioteca.R;

public class verDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_datos);
    }

    public void salirClienteDatos(View v){
        Intent sig = new Intent(this, MenuClient.class);
        startActivity(sig);
    }

}