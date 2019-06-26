package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.spinner.adapter.CountryAdapter;
import com.example.spinner.model.CountryItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CountryItem> mCountryList;
    private CountryAdapter mAdapter;
    String mavung ="";
    String sdt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();

        Spinner spinnerCountries = findViewById(R.id.spinner_countries);
        Button btn_submit = findViewById(R.id.btn_submit);
        final EditText ed_sdt = findViewById(R.id.ed_Sdt);
        final  TextView tv_sdt = findViewById(R.id.tv_sdt);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sdt = ed_sdt.getText().toString().trim();

                tv_sdt.setText(mavung+sdt);

            }
        });

        mAdapter = new CountryAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryItem clickedItem = (CountryItem) parent.getItemAtPosition(position);
                mavung = clickedItem.getCountryName();
                Toast.makeText(MainActivity.this, mavung + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new CountryItem("+034", R.drawable.velezuela));
        mCountryList.add(new CountryItem("+098", R.drawable.velezuela));
        mCountryList.add(new CountryItem("+890", R.drawable.velezuela));
        mCountryList.add(new CountryItem("+67", R.drawable.velezuela));
    }
}
