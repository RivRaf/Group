package com.example.rafael.group.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.rafael.group.Adapters.LvAdapter;
import com.example.rafael.group.Adapters.SlideAdapter;
import com.example.rafael.group.R;
import com.example.rafael.group.SlideActivity;

/**
 * Created by RAFAEL on 01/03/2017.
 */

public class SlideFragment2 extends android.support.v4.app.Fragment {
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View convertView= LayoutInflater.from(getActivity()).inflate(R.layout.fragment_slide2,container,false);
        listView = (ListView)convertView.findViewById(R.id.lvFgm2);

        LvAdapter lvAdapter=new LvAdapter(getActivity(), SlideActivity.listaHotels);
        listView.setAdapter(lvAdapter);

        return convertView;
    }

    public static SlideFragment2 newInstance(String text) {

        SlideFragment2 f = new SlideFragment2();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

}
