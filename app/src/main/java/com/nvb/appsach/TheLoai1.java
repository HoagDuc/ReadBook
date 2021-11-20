package com.nvb.appsach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TheLoai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_loai1);
        ImageView trolai = findViewById(R.id.Trolai);

        trolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TheLoai1.this,
                        TheLoai.class);
                startActivity(intent);
            }
        });

        ListView listView;
        ArrayList<ListSach> arrayList;
        AdapterListSach adapterListSach;

        listView = findViewById(R.id.ListView);
        arrayList = new ArrayList<>();
        arrayList.add(new ListSach("Đắc nhân tâm","TG:Nguyễn Văn Bình",R.drawable.images));
        arrayList.add(new ListSach("Tội ác và trừng phạt","TG:Dostoevsky",R.drawable.images2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img2));
        arrayList.add(new ListSach("Tôi tài giỏi, bạn cũng thế","TG:J.D.Salinger",R.drawable.img3));
        arrayList.add(new ListSach("Nhà giả kim","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList.add(new ListSach("Bắt trẻ đồng xanh","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList.add(new ListSach("Đắc nhân tâm","TG:Nguyễn Văn Bình",R.drawable.images));
        arrayList.add(new ListSach("Tội ác và trừng phạt","TG:Dostoevsky",R.drawable.images2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img2));
        arrayList.add(new ListSach("Tôi tài giỏi, bạn cũng thế","TG:J.D.Salinger",R.drawable.img3));
        arrayList.add(new ListSach("Nhà giả kim","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList.add(new ListSach("Bắt trẻ đồng xanh","TG:Nguyễn Văn Bình",R.drawable.img5));



        adapterListSach = new AdapterListSach(TheLoai1.this,R.layout.layout_demo,arrayList);
        listView.setAdapter(adapterListSach);

    }
}