package com.example.docsien;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Medication {

    public String medicationName, dateStart, dateEnd;

    // String date consumed, Integer 1 for consumed 0 for missed
    public HashMap<String, Integer> datesOfMedicineConsumed;

    // !!! Delete after test
    public ArrayList<String> dates;

    // Empty constructor for Firebase
    public Medication() {
        // !!! Delete inside of function after test
        this.medicationName = "Amoxicillin";
        this.dateStart = "15-11";
        this.dateEnd = "21-11";
        this.datesOfMedicineConsumed = new HashMap<String, Integer>();

        // Fill dates patient has to consume medicine
        String[] valuesStart = dateStart.split("-");
        int dayStart = Integer.parseInt(valuesStart[0]);
        int monthStart = Integer.parseInt(valuesStart[1]);
        String[] valuesEnd = dateEnd.split("-");
        int dayEnd = Integer.parseInt(valuesEnd[0]);

        for (int i = dayStart; i <= dayEnd; ++i) {
            this.datesOfMedicineConsumed.put(i + "-" + monthStart, 0);
        }

        // !!! Delete after test?, find more optimal solution?
        dates = new ArrayList<>();
        List<String> listOfDates = new ArrayList(datesOfMedicineConsumed.keySet());
        Collections.sort(listOfDates);
        dates.addAll(listOfDates);

//        for (String date : listOfDates) {
//            Log.i("Medication", "date: " + date);
//            dates.add(date);
//        }
    }

    public Medication(String medicationName, String startDate, String endDate) {
        this.medicationName = "Amoxicillin";
        this.dateStart = "15-11";
        this.dateEnd = "21-11";
        this.datesOfMedicineConsumed = new HashMap<String, Integer>();

        // Fill dates patient has to consume medicine
        String[] valuesStart = dateStart.split("-");
        int dayStart = Integer.parseInt(valuesStart[0]);
        int monthStart = Integer.parseInt(valuesStart[1]);
        String[] valuesEnd = dateEnd.split("-");
        int dayEnd = Integer.parseInt(valuesEnd[0]);

        for (int i = dayStart; i <= dayEnd; ++i) {
            this.datesOfMedicineConsumed.put(i + "-" + monthStart, 0);
        }
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public HashMap<String, Integer> getDatesOfMedicineConsumed() {
        return datesOfMedicineConsumed;
    }

    public void setDatesOfMedicineConsumed(HashMap<String, Integer> datesOfMedicineConsumed) {
        this.datesOfMedicineConsumed = datesOfMedicineConsumed;
    }

    // !!! Delete after test

    public ArrayList<String> getDates() {
        return dates;
    }

    public void setDates(ArrayList<String> dates) {
        this.dates = dates;
    }
}
