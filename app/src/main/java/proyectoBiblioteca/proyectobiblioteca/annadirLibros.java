package proyectoBiblioteca.proyectobiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectobiblioteca.R;

import java.util.UUID;

public class annadirLibros extends AppCompatActivity {

    private EditText inputTituloInsert;
    private EditText inputAutorInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annadir_libros);

        inputTituloInsert = (EditText) findViewById(R.id.inputTituloInsert);
        inputAutorInsert = (EditText) findViewById(R.id.inputAutorInsert);
    }

    public void terminarLibros(View c){
        Intent sig = new Intent(this, MenuAdmin.class);
        startActivity(sig);
    }

    public void ingresarLibros(View c){
        try{
            if (inputTituloInsert.getText().length()==0 || inputAutorInsert.getText().length()==0){
                Toast.makeText(annadirLibros.this, "Título y autor son campos requeridos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(annadirLibros.this, "Ingreso ELSE", Toast.LENGTH_SHORT).show();
                Libro l = new Libro();
                l.setTitulo(inputTituloInsert.getText().toString());
                l.setAutor(inputAutorInsert.getText().toString());
                l.setImagen(R.drawable.placeholderportada);
                l.setUuid(UUID.randomUUID().toString());
                boolean res = Database.getDatabase(getApplicationContext()).insertLibro(l);
                if (res == true){
                    Toast.makeText(annadirLibros.this, "Valor insertado", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(annadirLibros.this, "Valor no insertado", Toast.LENGTH_SHORT).show();
            }
        }catch(Exception e){
            Toast.makeText(annadirLibros.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

}