package com.example.appactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_saludo);
    String nombre = "HOLA "+getIntent().getStringExtra(MainActivity.NAME);
    TextView txt_saludo = (TextView)findViewById(R.id.txt_saludo);
    txt_saludo.setText(nombre);
  }
}