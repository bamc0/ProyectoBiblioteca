package proyectoBiblioteca.proyectobiblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectobiblioteca.R;

import java.util.ArrayList;
import java.util.List;

public class ClientePrestamos extends AppCompatActivity {

    private RecyclerView librosPrestados;
    private PrestamoAdapter prestamoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_prestamos);

        librosPrestados = (RecyclerView) findViewById(R.id.librosPrestados);
        prestamoAdapter = new PrestamoAdapter(this);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        prestamoAdapter.setData(getData());
        librosPrestados.setAdapter(prestamoAdapter);
        librosPrestados.setLayoutManager(linearLayoutManager);
    }

    public void salirClientePrestamos(View v){
        Intent sig = new Intent(this, MenuClient.class);
        startActivity(sig);
    }

    private List<Prestamo> getData(){
        List<Prestamo> prestamos = new ArrayList<>();
        Libro libro1 = new Libro(R.drawable.placeholderportada, "titulo 1", "autor 1");
        Socio socio1 = new Socio("123456789", "Socio1", "qwerty");
        Libro libro2 = new Libro(R.drawable.placeholderportada, "titulo 2", "autor 2");
        Libro libro3 = new Libro(R.drawable.placeholderportada, "titulo 3", "autor 3");
        Libro libro4 = new Libro(R.drawable.placeholderportada, "titulo 4", "autor 4");
        prestamos.add(new Prestamo(libro1,socio1,999,0));
        prestamos.add(new Prestamo(libro2,socio1,9999,0));
        prestamos.add(new Prestamo(libro3,socio1,999,1));
        prestamos.add(new Prestamo(libro4,socio1,999,2));
        return prestamos;


    }

}