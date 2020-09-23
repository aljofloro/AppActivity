package com.example.appactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public static String NAME = "NOMBRE";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toast.makeText(getApplicationContext(),
        "Estoy en onCreate()",Toast.LENGTH_SHORT)
        .show();

    //Agregar el manejo del botón
    Button btn_saludar = (Button)findViewById(R.id.btn_saludo);

    btn_saludar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        EditText edt_nombre = (EditText)findViewById(R.id.edt_name);
        String nombre = edt_nombre.getText().toString();
        if(nombre.equals("")){
          Toast.makeText(getApplicationContext(),"Ingrese un nombre",Toast.LENGTH_SHORT).show();
        }else{
          Intent intent = new Intent(getApplicationContext(),SaludoActivity.class);
          intent.putExtra(NAME,nombre);
          startActivity(intent);
        }
      }
    });
  }

  @Override
  protected void onStart(){
    super.onStart();
    Toast.makeText(getApplicationContext(),
        "Estoy en onStart()",Toast.LENGTH_SHORT)
        .show();
  }

  @Override
  protected void onRestart(){
    super.onRestart();
    Toast.makeText(getApplicationContext(),
        "Estoy en onRestart()",Toast.LENGTH_SHORT)
        .show();
  }

  @Override
  protected void onResume(){
    super.onResume();
    Toast.makeText(getApplicationContext(),
        "Estoy en onResume()",Toast.LENGTH_SHORT)
        .show();
  }

  @Override
  protected void onPause(){
    super.onPause();
    Toast.makeText(getApplicationContext(),
        "Estoy en onPause()",Toast.LENGTH_SHORT)
        .show();
  }

  @Override
  protected void onStop(){
    super.onStop();
    Toast.makeText(getApplicationContext(),
        "Estoy en onStop()",Toast.LENGTH_SHORT)
        .show();
  }

  @Override
  protected void onDestroy(){
    super.onDestroy();
    Toast.makeText(getApplicationContext(),
        "Estoy en onDestroy()",Toast.LENGTH_SHORT)
        .show();
  }

}