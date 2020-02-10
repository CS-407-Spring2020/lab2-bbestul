package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFunction (View view){
        EditText myFieldText = (EditText) findViewById(R.id.editText);
//        Toast.makeText(MainActivity.this, myFieldText.getText().toString(), Toast.LENGTH_LONG).show();
//        Log.i("Info", "Button Pressed");
        goToActivity2(myFieldText.getText().toString());

    }

    public void goToActivity2(String string){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", string);
        startActivity(intent);
    }
}
