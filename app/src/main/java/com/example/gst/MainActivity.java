package com.example.gst;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {

    EditText total,taxvalue,sgst;
    private androidx.appcompat.app.AppCompatDelegate AppCompatDelegate;

    public void nine(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);

        double totalvalue = Double.parseDouble(total.getText().toString());
        double taxablevalue= new BigDecimal(totalvalue/1.05).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double gst=new BigDecimal((totalvalue-taxablevalue)/2).setScale(2, RoundingMode.HALF_UP).doubleValue();

        taxvalue.setText(Double.toString(taxablevalue));
        sgst.setText(Double.toString(gst));
    }
    public void twelve(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);

        double totalvalue = Double.parseDouble(total.getText().toString());
        double taxablevalue= new BigDecimal(totalvalue/1.12).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double gst=new BigDecimal((totalvalue-taxablevalue)/2).setScale(2, RoundingMode.HALF_UP).doubleValue();

        taxvalue.setText(Double.toString(taxablevalue));
        sgst.setText(Double.toString(gst));
    }
    public void eighteen(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);

        double totalvalue = Double.parseDouble(total.getText().toString());
        double taxablevalue= new BigDecimal(totalvalue/1.18).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double gst=new BigDecimal((totalvalue-taxablevalue)/2).setScale(2, RoundingMode.HALF_UP).doubleValue();

        taxvalue.setText(Double.toString(taxablevalue));
        sgst.setText(Double.toString(gst));
    }
    public void clear(View view){
        total = findViewById(R.id.total);
        taxvalue = findViewById(R.id.taxvalue);
        sgst = findViewById(R.id.sgst);
        taxvalue.setText("");
        total.setText("");
        sgst.setText("");
    }
    public void next (View view) {
        Intent intent = new Intent(this, secondGST.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}