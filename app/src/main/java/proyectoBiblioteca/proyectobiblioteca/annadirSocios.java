package proyectoBiblioteca.proyectobiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectobiblioteca.R;


public class annadirSocios extends AppCompatActivity {

    private EditText inputAnnadirSocioNombre;
    private EditText inputAnnadirSocioRut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annadir_socios);

        inputAnnadirSocioNombre = (EditText) findViewById(R.id.inputAnnadirSocioNombre);
        inputAnnadirSocioRut = (EditText) findViewById(R.id.inputAnnadirSocioRut);
    }



    public void terminarSocios(View c){
        Intent sig = new Intent(this, MenuAdmin.class);
        startActivity(sig);
    }
}