package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.spinner.adapter.SpinnerAdapter;
import com.example.spinner.model.Phone;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AppCompatSpinner spn_Sdt;
    public TextView tv_sdt;
    EditText ed_Sdt;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        anhxa();

       final ArrayList<Phone> phoneList1;


       phoneList1 = new ArrayList<>();
       phoneList1.add(new Phone("#035","1"));
        phoneList1.add(new Phone("#0398","2"));
        phoneList1.add(new Phone("#032","3"));
        phoneList1.add(new Phone("#031","4"));

       // khởi tạo 1 list đối tượng là sđt
        // tạo ra  1 đối tượng empty để hiển thị mặc định spinner


        final SpinnerAdapter spinnerAdapter = new SpinnerAdapter(MainActivity.this,phoneList1);
        spn_Sdt.setAdapter(spinnerAdapter);
        spn_Sdt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Phone phone = phoneList1.get(position);
                String mavung = phone.mavung;


                Toast.makeText(MainActivity.this,phone.mavung, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });



        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sdt =  ed_Sdt.getText().toString().trim();
                tv_sdt.setText(mavung+sdt);


            }


        });
    }

    private void anhxa() {
    spn_Sdt = findViewById(R.id.spn_Sdt);
    tv_sdt = findViewById(R.id.tv_sdt);
    ed_Sdt = findViewById(R.id.ed_Sdt);
    btn_submit = findViewById(R.id.btn_submit);

    }
}
