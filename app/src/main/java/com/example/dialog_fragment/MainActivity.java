package com.example.dialog_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DeleteData {

    Button btnXoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnXoa = (Button) findViewById(R.id.buttonXoa);

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentHopThoai fragmentHopThoai = new FragmentHopThoai();
                fragmentHopThoai.show(getFragmentManager(), "dialog");
            }
        });
    }

    @Override
    public void GiaTriXoa(boolean delete) {
        if(delete){
            Toast.makeText(this, "Ban chon xoa", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Khong xoa", Toast.LENGTH_SHORT).show();
        }
    }
}