package com.example.proyectobiblioteca;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database database;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private Database(Context context){
        FirebaseApp.initializeApp(context);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
    private static Database getDatabase(Context context){
        if (database == null){
            database = new Database(context);
        }
        return database;
    }

    // HACER TODOS LOS OTROS MÉTODOS ESTÁTICOS

    public static boolean insertLibro(Context context, Libro libro){
        try {
        getDatabase(context).databaseReference.child("Libro").child(libro.getUuid()).setValue(libro);
        return true;
        } catch (Exception e){
            return false;
        }
    }


    public static List<Libro> selectLibros(Context context){
        List<Libro> libroList = new ArrayList<>();
        getDatabase(context).databaseReference.child("Libro").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                libroList.clear();
                for (DataSnapshot objSnapshot : snapshot.getChildren()){
                    Libro l = objSnapshot.getValue(Libro.class);
                    libroList.add(l);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                libroList.clear();            }
        });
        return libroList;
    }


    public static boolean insertSocio(Context context, Socio socio){
        try {
            getDatabase(context).databaseReference.child("Socio").child(socio.getUuid()).setValue(socio);
            return true;
        } catch (Exception e){
            return false;
        }
    }


    public static List<Socio> selectSocios(Context context){
        List<Socio> socioList = new ArrayList<>();
        getDatabase(context).databaseReference.child("Socio").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                socioList.clear();
                for (DataSnapshot objSnapshot : snapshot.getChildren()){
                    Socio s = objSnapshot.getValue(Socio.class);
                    socioList.add(s);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                socioList.clear();            }
        });
        return socioList;
    }

}

