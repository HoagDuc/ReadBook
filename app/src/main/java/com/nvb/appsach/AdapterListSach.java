package com.nvb.appsach;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListSach extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ListSach> arraylist;

    public AdapterListSach(Context context, int layout, List<ListSach> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    public AdapterListSach(HomeFragment homeFragment, int layout_demo, ArrayList<ListSach> arrayList) {
        this.context= homeFragment.getContext();
        this.layout = layout_demo;
        this.arraylist = arrayList;

    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        ListSach listSach = arraylist.get(position);
        TextView textView = convertView.findViewById(R.id.Name);
        TextView textView1 = convertView.findViewById(R.id.Mota);
        ImageView imageView= convertView.findViewById(R.id.imgAnh);

        textView.setText(listSach.getTenSach());
        textView1.setText(listSach.getTenTG());
        imageView.setImageResource(listSach.getAnh());

        return convertView;
    }
}
