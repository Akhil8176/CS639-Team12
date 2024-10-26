package com.example.midtermsaikiran;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputSide;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure activity_main.xml exists in res/layout

        // Initialize UI components
        inputSide = findViewById(R.id.input_side);
        resultText = findViewById(R.id.result_text);
        Button calculateButton = findViewById(R.id.calculate_button);

        // Set the onClickListener for the Calculate button
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    // Method to calculate the area of the square
    private void calculateArea() {
        String sideStr = inputSide.getText().toString();

        if (sideStr.isEmpty()) {
            Toast.makeText(this, "Please enter a side length", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Convert input to double and calculate area
            double side = Double.parseDouble(sideStr);
            double area = side * side;
            resultText.setText("Area: " + area);
        } catch (NumberFormatException e) {
            // Handle invalid input
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }
    }
}
