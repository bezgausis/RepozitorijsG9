package com.example.deniv.repozitorijsg9;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText etText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etText2 = (EditText) findViewById(R.id.editText2);
    }

    public void atvert_akt1(View view){
        Intent intent = new Intent(Main2Activity.this, MainActivity.class); //new Intent(FromActivity.this, ToActivity.class);
        startActivity(intent);
    }
    // print out saved data - to ko saglabajam nolasit pogai
    public void nolasit(View view){
        SharedPreferences sharedPref = getSharedPreferences("info_kategorija", Context.MODE_PRIVATE);
        String name = sharedPref.getString("edit_lauks", "");
        etText2.setText(name);

        if (name == "") Toast.makeText(this,"tukšs :(", Toast.LENGTH_LONG).show();
        else Toast.makeText(this,"nolasīts", Toast.LENGTH_LONG).show();
    }
}
