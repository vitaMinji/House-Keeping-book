package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sub1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        Button button2 = findViewById(R.id.button2);
        final EditText editText1 = (EditText)findViewById(R.id.editText1);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int usedMoney;
                usedMoney = Integer.parseInt(editText1.getText().toString()); //정수값 가져오기
                Intent intent = new Intent(Sub1Activity.this,MainActivity.class);
                startActivity(intent);

            }

        });

    }

}
//
//
//    String symbolvalue;
//
//symbolvalue = edit.getText().toString();
//
