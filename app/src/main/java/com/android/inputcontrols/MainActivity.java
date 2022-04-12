package com.android.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chocolate;
    private CheckBox sprinkles;
    private CheckBox nuts;
    private CheckBox cherries;
    private CheckBox cookie;

    private Button result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.chocolate = (CheckBox) this.findViewById(R.id.Chocolate);
        this.sprinkles = (CheckBox) this.findViewById(R.id.Sprinkles);
        this.nuts = (CheckBox) this.findViewById(R.id.Crushed);
        this.cherries = (CheckBox) this.findViewById(R.id.Cherries);
        this.cookie = (CheckBox) this.findViewById(R.id.Orio);

        this.result = (Button) this.findViewById(R.id.button);

        this.result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResult();
            }
        });

    }

    private void showResult()  {
        String message = null;
        if(this.chocolate.isChecked()) {
            message =  this.chocolate.getText().toString();
        }
        if(this.sprinkles.isChecked()) {
            if(message== null)  {
                message =  this.sprinkles.getText().toString();
            } else {
                message += ", " + this.sprinkles.getText().toString();
            }
        }
        if(this.nuts.isChecked()) {
            if(message== null)  {
                message =  this.nuts.getText().toString();
            } else {
                message += ", " + this.nuts.getText().toString();
            }
        }
        if(this.cherries.isChecked()) {
            if(message== null)  {
                message =  this.cherries.getText().toString();
            } else {
                message += ", " + this.cherries.getText().toString();
            }
        }
        if(this.cookie.isChecked()) {
            if(message== null)  {
                message =  this.cookie.getText().toString();
            } else {
                message += ", " + this.cookie.getText().toString();
            }
        }

        message = message == null? "You select nothing": "Toppings: " + message;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}