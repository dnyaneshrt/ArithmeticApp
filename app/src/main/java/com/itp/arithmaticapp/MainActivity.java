package com.itp.arithmaticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn_add,btn_sub,btn_div,btn_mult;
    TextView txt_answer;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_div = findViewById(R.id.btn_div);
        btn_mult = findViewById(R.id.btn_mult);
        txt_answer = findViewById(R.id.txt_answer);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int num1=Integer.parseInt(et1.getText().toString());
               int num2=Integer.parseInt(et2.getText().toString());
                Toast.makeText(MainActivity.this, (num1+num2)+"", Toast.LENGTH_SHORT).show();
               txt_answer.setText((num1+num2)+"");
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(et1.getText().toString());
                int num2=Integer.parseInt(et2.getText().toString());
                txt_answer.setText((num1-num2)+"");
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(et1.getText().toString());
                int num2=Integer.parseInt(et2.getText().toString());
                txt_answer.setText((num1*num2)+"");
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(et1.getText().toString());
                int num2=Integer.parseInt(et2.getText().toString());
                txt_answer.setText((num1/num2)+"");
            }
        });
    }
}