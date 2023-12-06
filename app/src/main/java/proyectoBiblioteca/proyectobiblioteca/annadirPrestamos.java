package proyectoBiblioteca.proyectobiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectobiblioteca.R;

public class annadirPrestamos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annadir_prestamos);
    }
    public void terminarPrestamos(View v){
        Intent sig = new Intent(this, MenuAdmin.class);
        startActivity(sig);
    }
}