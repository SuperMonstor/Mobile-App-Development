package com.example.changecolour;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float font=30;
    int ch=1;
    int counter=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btncolor= findViewById(R.id.ColorButton);
        final Button btnfont= findViewById(R.id.FontButon);
        final Button btntxt = findViewById(R.id.TextButton);


        final TextView txt=findViewById(R.id.textView);

        btnfont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setTextSize(font);
                font=font+5;
                if (font==50) {
                    font = 30;
                }

            }
        });

        btncolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch){
                    case 1: txt.setTextColor(Color.RED);
                        break;
                    case 2: txt.setTextColor(Color.YELLOW);
                        break;
                    case 3: txt.setTextColor(Color.GREEN);
                        break;

                }
                ch++;
                if(ch==4){
                    ch=1;
                }
            }
        });

        btntxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (counter==1){
                    txt.setText("I AM A CHANGED TEXT");
                    txt.setTextColor(Color.BLUE);
                    counter++;}
                 else {
                    txt.setText("CHANGE ME");
                    txt.setTextColor(Color.CYAN);
                    counter--;
                }
            }
        });
    }
}
