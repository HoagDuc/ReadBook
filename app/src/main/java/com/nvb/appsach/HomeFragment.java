package com.nvb.appsach;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private View mview;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview= inflater.inflate(R.layout.homefragment,container,false);
        ListView listView;
        ArrayList<ListSach> arrayList;
        AdapterListSach adapterListSach;
        listView = mview.findViewById(R.id.ListHome);
        arrayList = new ArrayList<>();
        arrayList.add(new ListSach("Đắc nhân tâm","TG:Nguyễn Văn Bình",R.drawable.images));
        arrayList.add(new ListSach("Tội ác và trừng phạt","TG:Dostoevsky",R.drawable.images2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img3));
        arrayList.add(new ListSach("Tôi tài giỏi, bạn cũng thế","TG:J.D.Salinger",R.drawable.img3));
        arrayList.add(new ListSach("Nhà giả kim","TG:Nguyễn Văn Bình",R.drawable.images));
        arrayList.add(new ListSach("Bắt trẻ đồng xanh","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList.add(new ListSach("Đắc nhân tâm","TG:Nguyễn Văn Bình",R.drawable.images));
        arrayList.add(new ListSach("Tội ác và trừng phạt","TG:Dostoevsky",R.drawable.images2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.images2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img2));
        arrayList.add(new ListSach("Tôi tài giỏi, bạn cũng thế","TG:J.D.Salinger",R.drawable.img3));
        arrayList.add(new ListSach("Nhà giả kim","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList.add(new ListSach("Bắt trẻ đồng xanh","TG:Nguyễn Văn Bình",R.drawable.img5));
        adapterListSach = new AdapterListSach(HomeFragment.this,R.layout.layout_demo,arrayList);
        listView.setAdapter(adapterListSach);


        ListView listView1;
        ArrayList<ListSach> arrayList1;
        AdapterListSach adapterListSach1;
        listView1 = mview.findViewById(R.id.ListHome1);
        arrayList1 = new ArrayList<>();
        arrayList.add(new ListSach("Đắc nhân tâm","TG:Nguyễn Văn Bình",R.drawable.images));
        arrayList.add(new ListSach("Tội ác và trừng phạt","TG:Dostoevsky",R.drawable.images2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img2));
        arrayList.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img2));
        arrayList.add(new ListSach("Tôi tài giỏi, bạn cũng thế","TG:J.D.Salinger",R.drawable.img3));
        arrayList.add(new ListSach("Nhà giả kim","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList.add(new ListSach("Bắt trẻ đồng xanh","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList1.add(new ListSach("Bài giảng cuối cùng","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList1.add(new ListSach("Đi tìm lẽ sống","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList1.add(new ListSach("Vũ trụ","TG:Nguyễn Văn Bình",R.drawable.images));
        arrayList1.add(new ListSach("Anh em nhà Karamazov","TG:Dostoevsky",R.drawable.images2));
        arrayList1.add(new ListSach("Đồi Thỏ","TG:Paulo Coelho",R.drawable.img2));
        arrayList1.add(new ListSach("Người xa lạ","TG:J.D.Salinger",R.drawable.img3));
        arrayList1.add(new ListSach("Nhà giả kim","TG:Nguyễn Văn Bình",R.drawable.img5));
        arrayList1.add(new ListSach("Xứ cát","TG:Nguyễn Văn Bình",R.drawable.img5));
        adapterListSach1 = new AdapterListSach(HomeFragment.this,R.layout.layout_demo,arrayList);
        listView1.setAdapter(adapterListSach1);

        return mview;
    }

}
