package com.example.csci370_lab_06;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class Retrieve {

    private LabDatabase database;

    @RequiresApi(api = Build.VERSION_CODES.P)
    public void retrieveAsync(Context context) {
        ArrayList<String> personNames = new ArrayList<>();

        ArrayList<Person> people = (ArrayList) database.personDao().getAllPeople();

        for (Person p : people) {
            personNames.add((String) p.getName());
        }

        Intent i = new Intent(context, PersonsActivity.class);
        i.putExtra("People", personNames);
        context.startActivity(i);
    }
}
