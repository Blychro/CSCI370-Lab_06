package com.example.csci370_lab_06;

import android.os.AsyncTask;

public class Insert extends AsyncTask<Person, Void, Void> {

    private LabDatabase database;

    public void InsertAsync(LabDatabase database){
        this.database = database;
    }

    protected Void doInBackground(Person[] people) {
        database.personDao().insertPerson(people[0]);
        return null;
    }
}
