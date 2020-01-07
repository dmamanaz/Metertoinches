package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;
    //1m = 39.3701in

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.mti_et);
        convertButton = (Button) findViewById(R.id.convert_btn);
        resultTextView = (TextView) findViewById(R.id.meters_tv);


convertButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //Conversion logic
        double  multiplier = 39.37;
        double result = 0.0;



        if(enterMeters.getText().toString().equals("")){

            resultTextView.setText(R.string.error_message);
            resultTextView.setTextColor(Color.RED);
        }else {
            double meterValue = Double.parseDouble(enterMeters.getText().toString());
            result = multiplier * meterValue;

            resultTextView.setTextColor(Color.DKGRAY);
            resultTextView.setText(String.format("%.2f", result) + " inches");
        }
    }
});



    }
}
