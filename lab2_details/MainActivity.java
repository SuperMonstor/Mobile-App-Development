package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String name,reg,dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText e1,e2;
        Button bt;
        final Spinner sp;

        String [] dept_array = {"CSE","ECE","EEE","ISE","Civil","Mech"};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.nameIn);
        e2 = (EditText) findViewById(R.id.usnIn);

        bt = (Button) findViewById(R.id.btn_submit);
        sp = (Spinner) findViewById(R.id.dept_list);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,dept_array);
        sp.setAdapter(adapter);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = e1.getText().toString();
                reg = e2.getText().toString();
                dept = sp.getSelectedItem().toString();

                Intent i =  new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("name_key",name);
                i.putExtra("usn_key",reg);
                i.putExtra("dept_key",dept);

                startActivity(i);
            }
        });
    }
}
