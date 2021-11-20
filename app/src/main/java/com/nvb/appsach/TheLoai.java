package com.nvb.appsach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TheLoai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_loai);

        ImageView trolai = findViewById(R.id.Trolai);

        trolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TheLoai.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });

        ListView listView = findViewById(R.id.ListView);
        List<String> list = new ArrayList<>();
        list.add("CHÂM NGÔN SỐNG");
        list.add("PHÊ PHÁN");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(TheLoai.this,TheLoai1.class));
                }else if(position==1){
                    startActivity(new Intent(TheLoai.this, TheLoai2.class));
                }
            }
        });
    }
}