package com.example.csci370_lab_06;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private Button sub;
    private Button see;
    private LabDatabase labDB;
    private String DATABASE_NAME;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editText);
        sub = findViewById(R.id.button);
        see = findViewById(R.id.button2);
        DATABASE_NAME = "People";
        id = 1;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enter = name.getText().toString();

                Person current;
                current = new com.example.csci370_lab_06.Person(id++, enter);

                Insert insert = new Insert();
                insert.InsertAsync(labDB);

                Toast submitToast = Toast.makeText(getApplicationContext(),name.getText() + " submitted", Toast.LENGTH_SHORT);
                submitToast.show();
            }
        });

        see.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @Override
            public void onClick(View v) {

                Retrieve retrieve = new Retrieve();
                retrieve.retrieveAsync(getApplicationContext());

                Toast showToast = Toast.makeText(getApplicationContext(),"show",Toast.LENGTH_SHORT);
                showToast.show();
            }
        });


    }
}
