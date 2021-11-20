package com.nvb.appsach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CaiDat extends AppCompatActivity {
    Button xoa;
    Button xoa1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);
        ImageView trolai = findViewById(R.id.Trolai);

        trolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(CaiDat.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
        xoa = findViewById(R.id.Xoa);
        xoa1=findViewById(R.id.Xoa1);

        xoa.setOnClickListener(mListener);
        xoa1.setOnClickListener(mListener);
    }
    View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id){
                case R.id.Xoa:
                    Toast.makeText(CaiDat.this,
                            "Đã xóa Cache", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Xoa1:
                    Toast.makeText(CaiDat.this,
                            "Đã xóa dữ liệu ứng dụng", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }
    };
}