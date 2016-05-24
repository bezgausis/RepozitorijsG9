package com.example.deniv.repozitorijsg9;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText = (EditText) findViewById(R.id.editText);
    }
    public void atvert_akt2(View view)// metode pogai Aktivitate2 atver aktivitati2
    {
        Intent sd=new Intent(this,Main2Activity.class);
        startActivity(sd);
    }
    // saglaba to kas ievadlauka iekš SharedPreferences
     public void saglabat(View view){
         SharedPreferences sharedPref = getSharedPreferences("info_kategorija", Context.MODE_PRIVATE);
         SharedPreferences.Editor editor = sharedPref.edit();
         editor.putString("edit_lauks", etText.getText().toString());
         editor.apply();
         Toast.makeText(MainActivity.this, "saglabāts!!!", Toast.LENGTH_SHORT).show();

    }



}
