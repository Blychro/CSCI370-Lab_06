package com.example.csci370_lab_06;

import android.app.Person;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase {

    public abstract PersonDao personDao();

}
