package com.example.hw421;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView textView;
    private String sIDEdText;
    private String sPlace1EdText;
    private String sPlace2EdText;
    private String sMoneyEdText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView = findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        sIDEdText = bundle.get("ID").toString();
        sPlace1EdText = bundle.get("Place1").toString();
        sPlace2EdText = bundle.get("Place2").toString();
        sMoneyEdText = bundle.get("Money").toString();
        textView.setText("ID "+ sIDEdText+"\n"+"Место/время отправления  "+sPlace1EdText+"\n"+"Место/время прибытия  "+sPlace2EdText+"\n"+"Стоимость (руб) "+sMoneyEdText+"\n");
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}