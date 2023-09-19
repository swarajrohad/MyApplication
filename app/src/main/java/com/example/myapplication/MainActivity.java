package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.myapplication.extra.NAME";
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openActivity(View v)
    {
        Toast.makeText(this, "Opening new Activity", Toast.LENGTH_SHORT).show();
        text = findViewById(R.id.editTextText);
        String name = text.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_NAME,name);
        startActivity(intent);
    }
    public void openScrollActivity(View v)
    {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}