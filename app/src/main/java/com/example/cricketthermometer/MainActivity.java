package com.example.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    Button btnCalculate;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber=findViewById(R.id.etNumber);
        btnCalculate =findViewById(R.id.btnCalculate);
        tvResult=findViewById(R.id.tvResult);
        btnCalculate.setOnClickListener(this::onClick);
        tvResult.setVisibility(View.GONE);
    }

    private void onClick(View view) {
        String answerStr = String.valueOf(etNumber.getText());
        int answer = Integer.parseInt(answerStr);
        int formula = answer / 3 + 4;

        String text = "The approximate temperature outside is " + formula + "degrees Celsius";
        tvResult.setText(text);
        tvResult.setVisibility(View.VISIBLE);
    }
}