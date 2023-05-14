package com.example.hw421;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText IDEdText;
    private EditText Place1EdText;
    private EditText Place2EdText;
    private EditText MoneyEdText;
    Button button;
    private String sIDEdText;
    private String sPlace1EdText;
    private String sPlace2EdText;
    private String sMoneyEdText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        IDEdText = findViewById(R.id.ID);
        Place1EdText = findViewById(R.id.Place1);
        Place2EdText = findViewById(R.id.Place2);
        MoneyEdText = findViewById(R.id.Money);

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sIDEdText = IDEdText.getText().toString();
                sPlace1EdText = Place1EdText.getText().toString();
                sPlace2EdText = Place2EdText.getText().toString();
                sMoneyEdText = MoneyEdText.getText().toString();

                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                intent.putExtra("ID",  sIDEdText);
                intent.putExtra ("Place1",sPlace1EdText);
                intent.putExtra("Place2",  sPlace2EdText);
                intent.putExtra("Money",sMoneyEdText);

                startActivity(intent);
            }
        });

    }
}