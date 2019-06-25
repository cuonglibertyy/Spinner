package com.example.spinner.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.spinner.R;
import com.example.spinner.model.Phone;

import java.util.List;

public class SpinnerAdapter implements android.widget.SpinnerAdapter {

    Context context;
    List<Phone> phoneList;

    public SpinnerAdapter(Context context, List<Phone> phoneList) {
        this.context = context;
        this.phoneList = phoneList;
    }




    // giao diện cho hàng được chọn
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.drop_row,parent,false);
        TextView tv_Sdt;
        tv_Sdt = convertView.findViewById(R.id.tv_Sdt);
        tv_Sdt.setText(phoneList.get(position).mavung);
        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.drop_row,parent,false);
        TextView tv_Sdt;
        tv_Sdt = convertView.findViewById(R.id.tv_Sdt);
        tv_Sdt.setText(phoneList.get(position).mavung);
        return convertView;
    }


// số hàng spinner hiển thị
    @Override
    public int getCount() {
        return phoneList.size();
    }
// câu lệnh lấy đối tượng đc hiển thị trên hàng theo vị trí  là biến position
    @Override
    public Phone getItem(int position) {
        Phone mavung = phoneList.get(position);
        return phoneList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    // câu lệnh quy định số loại giao diện trên danh sách spinner
    // ở đây ta dùng 1 file xml lên ta để là 1 giao diện
    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }



    @Override
    public int getItemViewType(int position) {
        return 0;
    }



    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }
}
