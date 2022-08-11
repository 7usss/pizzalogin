package com.example.pizzalogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        TextView username = (TextView) findViewById(R.id.emailTV);
        TextView password = (TextView) findViewById(R.id.passwordET);
        Button button = (Button) findViewById(R.id.buttonLogin);

        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {

                                          if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){

                                               //correct

                                              Toast.makeText(MainActivity.this,"login successful",Toast.LENGTH_LONG).show();
                                              Intent intent =new Intent(MainActivity.this,home.class);
                                              startActivity(intent);


                                          }else
                                              //wrong
                                              Toast.makeText(MainActivity.this,"login Faild",Toast.LENGTH_LONG).show();


                                          }
                                      });
                                  };




    }



