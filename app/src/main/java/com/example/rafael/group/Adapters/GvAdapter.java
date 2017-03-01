package com.example.rafael.group.Adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rafael.group.Objetos.Featured;
import com.example.rafael.group.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

/**
 * Created by RAFAEL on 01/03/2017.
 */

public class GvAdapter extends ArrayAdapter<Featured> {
    private Context context;
    private ArrayList<Featured> list;


    public GvAdapter(Context context, ArrayList<Featured> objects) {
        super(context,R.layout.layout_gv,objects);
        this.context = context;
        this.list = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.layout_gv,parent,false);
        SimpleDraweeView simpleDraweeView=(SimpleDraweeView)convertView.findViewById(R.id.sdvGv);
        TextView textViewtit=(TextView)convertView.findViewById(R.id.tvtit);
        TextView textViewprec=(TextView)convertView.findViewById(R.id.tvprec);
        Featured featured=(Featured)getItem(position);

        //simpleDraweeView.setImageURI(Uri.parse(featured.getRuta()));
        DraweeController controller = Fresco.newDraweeControllerBuilder().setUri(featured.getRuta()).setAutoPlayAnimations(true).build();
        simpleDraweeView.setController(controller);

        textViewprec.setText(featured.getPrecio());
        textViewtit.setText(featured.getTitulo());
        return convertView;
    }
}
