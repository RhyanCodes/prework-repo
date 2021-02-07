package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // Let user tap on the button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the label color
                    ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.burgundy));
            }
        });
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.mint));
            }
        });
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Change the text
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });
        // User can tap on the background to revert changes to the default settings
        // 1. Reset the text to "Hello from Rhyan!"
        // 2. Reset the text color to Black from Burgundy
        // 3. Reset the background color from mint to babyBlue
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Reset the text to "Hello from Rhyan!"
                textView.setText("Hello from Rhyan!");
                // 2. Reset the text color to Black from Burgundy
               textView.setTextColor(getResources().getColor(R.color.black));
                // 3. Reset the background color from mint to babyBlue
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.babyBlue));
            }
        });
        // When user clicks on this button, the text will update
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnteredText = ((EditText) findViewById(R.id.customTextButton)).getText().toString();
                textView.setText(userEnteredText);
                // Default string
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}