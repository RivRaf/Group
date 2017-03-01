package com.example.rafael.group.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.rafael.group.Adapters.GvAdapter;
import com.example.rafael.group.R;
import com.example.rafael.group.SlideActivity;

/**
 * Created by RAFAEL on 01/03/2017.
 */

public class SlideFragment extends android.support.v4.app.Fragment{
    private GridView gridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View convertView = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_slide,container,false);
        gridView=(GridView)convertView.findViewById(R.id.gvFgm1);

        GvAdapter gvAdapter= new GvAdapter(getActivity(),SlideActivity.listaFeat);
        gridView.setAdapter(gvAdapter);

        return convertView;
    }

    public static SlideFragment newInstance(String text) {

        SlideFragment f = new SlideFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}
