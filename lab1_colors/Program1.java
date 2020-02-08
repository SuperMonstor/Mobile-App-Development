package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt = (TextView) findViewById(R.id.textView);
        final Button btn = (Button) findViewById(R.id.submit);
        final EditText e1 = (EditText) findViewById(R.id.number1);
        final EditText e2 = (EditText) findViewById(R.id.number2);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(e1.getText().toString());
                int j = Integer.parseInt(e2.getText().toString());

                int sum=i+j;
                txt.setText("The sum is "+sum);

            }
        });
    }

}
