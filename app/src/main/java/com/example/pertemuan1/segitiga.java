package com.example.pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends AppCompatActivity {

    EditText a,t;
    Button hitung;
    EditText hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        a = (EditText)findViewById(R.id.input_alas);
        t = (EditText) findViewById(R.id.input_tinggi);
        hitung = (Button) findViewById(R.id.btn_hitung);
        hasil = (EditText) findViewById(R.id.output_luas);
        hitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String alas1 = a.getText().toString();
                String tinggi1 = t.getText().toString();
                double a = Double.parseDouble(alas1);
                double t = Double.parseDouble(tinggi1);
                double hasilakhir = (a * t)/2;
                String output = String.valueOf(hasilakhir);
                hasil.setText(output.toString());
            }

        });

    }
}