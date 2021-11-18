package com.nvb.appsach;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

public class SearchFragment extends AppCompatActivity {

    static final  String[] COUNTRIES = new  String[]{
            "Tội ác và trừng phạt",
            "Đồi Thỏ",
            "Bài giảng cuối cùng",
            "Lược sử vạn vật",
            "Đi tìm lẽ sống",
            "Đắc nhân tâm",
            "Vũ trụ",
            "Anh em nhà Karamazov",
            "Người xa lạ",
            "Xứ cát"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_fragment);
        ImageView trolai = findViewById(R.id.Trolai);

        trolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SearchFragment.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
        AutoCompleteTextView edittext = findViewById(R.id.EditText);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, COUNTRIES);
        edittext.setAdapter(adapter);
    }


}