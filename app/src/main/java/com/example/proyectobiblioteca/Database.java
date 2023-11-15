package com.example.proyectobiblioteca;

import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

}
