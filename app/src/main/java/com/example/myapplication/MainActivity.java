package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnSum, btnClear;
    private TextView txtResult;
    private EditText edtNumA, edtNumB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        setControl();
        setEvent();

        //initView();
        // addAction();
    }

    private void setEvent() {
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a, b, c;
                a = Float.parseFloat(edtNumA.getText().toString());
                b = Float.parseFloat(edtNumB.getText().toString());
                c = a + b;
                txtResult.setText("Tổng 2 số là : " + c);
                txtResult.setBackgroundColor(Color.GREEN);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumA.setText("");
                edtNumB.setText("");
            }
        });
    }

    private void setControl() {
        edtNumA = (EditText) findViewById(R.id.edtNumA);
        edtNumB = (EditText) findViewById(R.id.edtNumB);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnSum = (Button) findViewById(R.id.btnSum);
        btnClear = (Button) findViewById(R.id.btnClear);
    }


}
