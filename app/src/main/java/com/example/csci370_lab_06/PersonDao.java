package com.example.csci370_lab_06;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface PersonDao {
    @Insert
    void insertPerson(Person person);

    @Query("SELECT * FROM People")
    List<Person> getAllPeople();
}
