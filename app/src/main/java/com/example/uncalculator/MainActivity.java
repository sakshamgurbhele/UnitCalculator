package com.example.uncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView2;
    private TextView editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editTextNumber.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView2.setText("your conversion in Pounds is "+ pound + " lbs");
            }
        });
    }
}