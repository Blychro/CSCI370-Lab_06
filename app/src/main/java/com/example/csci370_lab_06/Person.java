package com.example.csci370_lab_06;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "People")
public class Person {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
