package com.example.sampledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView totalResult;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button3 = findViewById(R.id.button3);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        totalResult = findViewById(R.id.totalResult);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int sum = num1 + num2;
                Intent in = new Intent(FirstActivity.this, SecondActivity.class);
                in.putExtra("value", sum);
                startActivity(in);


            }
        });

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals(""))
                {
                    int num1 = Integer.parseInt(editText1.getText().toString());
                    int num2 = Integer.parseInt(editText2.getText().toString());
                 //   int sum = num1 + num2;
                    totalResult.setText(String.valueOf(num1 + num2));
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        editText1.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher);


        //    OR

/*
        editText1.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                totalResult.setText(addNumbers());
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                totalResult.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
    }

    private String addNumbers() {
        int number1;
        int number2;
        if (editText1.getText().toString() != "" && editText1.getText().length() > 0) {
            number1 = Integer.parseInt(editText1.getText().toString());
        } else {
            number1 = 0;
        }
        if (editText2.getText().toString() != "" && editText2.getText().length() > 0) {
            number2 = Integer.parseInt(editText2.getText().toString());
        } else {
            number2 = 0;
        }

        return Integer.toString(number1 + number2);
    }

 */


    }
}
