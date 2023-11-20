package com.example.proyectobiblioteca;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

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
    public static Database getDatabase(Context context){
        if (database == null){
            database = new Database(context);
        }
        return database;
    }


    public boolean insertLibro(Libro libro){
        try {
        databaseReference.child("Libro").child(libro.getUuid()).setValue(libro);
        return true;
        } catch (Exception e){
            return false;
        }
    }


    public List<Libro> selectLibros(){
        List<Libro> libroList = new ArrayList<>();
        databaseReference.child("Libro").addValueEventListener(new ValueEventListener() {
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


    public boolean insertSocio(Socio socio){
        try {
            databaseReference.child("Socio").child(socio.getUuid()).setValue(socio);
            return true;
        } catch (Exception e){
            return false;
        }
    }


    public List<Socio> selectSocios(){
        List<Socio> socioList = new ArrayList<>();
        databaseReference.child("Socio").addValueEventListener(new ValueEventListener() {
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

