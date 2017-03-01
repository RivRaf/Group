package com.example.rafael.group.Adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rafael.group.Objetos.Hotels;
import com.example.rafael.group.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

/**
 * Created by RAFAEL on 01/03/2017.
 */

public class LvAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Hotels> list;

    public LvAdapter(Context context, ArrayList<Hotels> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(position%2==0){
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_lv_inv,parent,false);
        }else {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_lv, parent, false);
        }
        SimpleDraweeView simpleDraweeView=(SimpleDraweeView)convertView.findViewById(R.id.sdvLv);
        TextView textViewtit =(TextView) convertView.findViewById(R.id.tvDesc);
        TextView textViewCost=(TextView)convertView.findViewById(R.id.tvCosto);
        Hotels hotels=(Hotels)getItem(position);

        simpleDraweeView.setImageURI(Uri.parse(hotels.getRuta()));
        textViewtit.setText(hotels.getNombre());
        textViewCost.setText(hotels.getPrecio());

        return convertView;
    }
}
