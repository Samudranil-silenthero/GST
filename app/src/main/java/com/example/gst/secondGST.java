package com.example.gst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class secondGST extends AppCompatActivity {

    EditText total,taxvalue,sgst,quantity,price;
    private androidx.appcompat.app.AppCompatDelegate AppCompatDelegate;

    public void nine(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);
        quantity = findViewById(R.id.quantity);
        price = findViewById(R.id.price);

        double qty = Double.parseDouble(quantity.getText().toString());
        double unit_price = Double.parseDouble(price.getText().toString());
        double totalvalue = new BigDecimal(qty*unit_price).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double taxablevalue= new BigDecimal(totalvalue/1.05).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double gst=new BigDecimal((totalvalue-taxablevalue)/2).setScale(2, RoundingMode.HALF_UP).doubleValue();

        taxvalue.setText(Double.toString(taxablevalue));
        sgst.setText(Double.toString(gst));
        total.setText(Double.toString(totalvalue));
    }
    public void twelve(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);
        quantity = findViewById(R.id.quantity);
        price = findViewById(R.id.price);

        double qty = Double.parseDouble(quantity.getText().toString());
        double unit_price = Double.parseDouble(price.getText().toString());
        double totalvalue = new BigDecimal(qty*unit_price).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double taxablevalue= new BigDecimal(totalvalue/1.12).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double gst=new BigDecimal((totalvalue-taxablevalue)/2).setScale(2, RoundingMode.HALF_UP).doubleValue();

        taxvalue.setText(Double.toString(taxablevalue));
        sgst.setText(Double.toString(gst));
        total.setText(Double.toString(totalvalue));
    }
    public void eighteen(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);
        quantity = findViewById(R.id.quantity);
        price = findViewById(R.id.price);

        double qty = Double.parseDouble(quantity.getText().toString());
        double unit_price = Double.parseDouble(price.getText().toString());
        double totalvalue = new BigDecimal(qty*unit_price).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double taxablevalue= new BigDecimal(totalvalue/1.18).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double gst=new BigDecimal((totalvalue-taxablevalue)/2).setScale(2, RoundingMode.HALF_UP).doubleValue();

        taxvalue.setText(Double.toString(taxablevalue));
        sgst.setText(Double.toString(gst));
        total.setText(Double.toString(totalvalue));
    }
    public void clear(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);
        quantity = findViewById(R.id.quantity);
        price = findViewById(R.id.price);
        taxvalue.setText("");
        total.setText("");
        sgst.setText("");
        quantity.setText("");
        price.setText("");
    }
    public void previous (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_gst);
    }
}