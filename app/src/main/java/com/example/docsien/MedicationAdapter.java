package com.example.docsien;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedicationAdapter extends RecyclerView.Adapter<MedicationAdapter.ViewHolder>{

    Context context;
    List<Medication> medications;

    public MedicationAdapter(Context context, List<Medication> medications) {
        this.context = context;
        this.medications = medications;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View medicationView = LayoutInflater.from(context).inflate(R.layout.item_medication, parent, false);
        return new ViewHolder(medicationView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Medication medication = medications.get(position);
        holder.bind(medication);
    }

    @Override
    public int getItemCount() {
        return medications.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvMedication, tvDate1, tvDate2, tvDate3, tvDate4, tvDate5, tvDate6, tvDate7;
        Button btnDate1, btnDate2, btnDate3, btnDate4, btnDate5, btnDate6, btnDate7;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMedication = itemView.findViewById(R.id.tvMedication);
            tvDate1 = itemView.findViewById(R.id.tvDate1);
            tvDate2 = itemView.findViewById(R.id.tvDate2);
            tvDate3 = itemView.findViewById(R.id.tvDate3);
            btnDate1 = itemView.findViewById(R.id.btnDate1);
            btnDate2 = itemView.findViewById(R.id.btnDate2);
            btnDate3 = itemView.findViewById(R.id.btnDate3);

            tvDate4 = itemView.findViewById(R.id.tvDate4);
            tvDate5 = itemView.findViewById(R.id.tvDate5);
            tvDate6 = itemView.findViewById(R.id.tvDate6);
            tvDate7 = itemView.findViewById(R.id.tvDate7);
            btnDate4 = itemView.findViewById(R.id.btnDate4);
            btnDate5 = itemView.findViewById(R.id.btnDate5);
            btnDate6 = itemView.findViewById(R.id.btnDate6);
            btnDate7 = itemView.findViewById(R.id.btnDate7);
        }

        public void bind(Medication medication) {
            tvMedication.setText(medication.getMedicationName());
            tvDate1.setText(medication.dates.get(0));
            tvDate2.setText(medication.dates.get(1));
            tvDate3.setText(medication.dates.get(2));
            tvDate4.setText(medication.dates.get(3));
            tvDate5.setText(medication.dates.get(4));
            tvDate6.setText(medication.dates.get(5));
            tvDate7.setText(medication.dates.get(6));

            // Change color of marker if medicine consumed
            // ! Add ability to change back to gray
            ArrayList<Button> listOfButtons = new ArrayList<Button>(Arrays.asList(btnDate1, btnDate2, btnDate3, btnDate4, btnDate5, btnDate6, btnDate7));
            for (Button button : listOfButtons) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button.setBackgroundColor(Color.GREEN);

                        Toast.makeText(context, "Minum obat sukses!", Toast.LENGTH_SHORT).show();
                        Log.i("MedicationAdapter", "button: " + button);
                    }
                });
            }
        }
    }
}
