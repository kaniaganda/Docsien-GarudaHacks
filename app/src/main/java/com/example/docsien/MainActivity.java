package com.example.docsien;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView rvMedications;
    List<Medication> medications;
    MedicationAdapter medicationAdapter;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up recycler view of medications
        rvMedications = findViewById(R.id.rvMedications);
        medications = new ArrayList<>();

        medicationAdapter = new MedicationAdapter(this, medications);
        rvMedications.setAdapter(medicationAdapter);
        rvMedications.setLayoutManager(new LinearLayoutManager(this));

        queryMedications();
    }

    // Add medications from database to list of medications
    private void queryMedications() {
//        reference = FirebaseDatabase.getInstance().getReference("patient").child("medication");
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                Medication medicationFromDB = snapshot.getValue(Medication.class);
//                Log.i("MainActivity", "Medication retrieved: " + medicationFromDB.medicationName);
//
//                medications.add(medicationFromDB);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//            }
//        });

        medications.add(new Medication());
        medicationAdapter.notifyDataSetChanged();
    }
}