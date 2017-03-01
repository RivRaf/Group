package com.example.rafael.group;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rafael.group.Adapters.SlideAdapter;
import com.example.rafael.group.Objetos.Featured;
import com.example.rafael.group.Objetos.Hotels;

import java.util.ArrayList;

public class SlideActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter slideAdapter;
    public static final ArrayList<Featured> listaFeat=new ArrayList<>();
    public static final ArrayList<Hotels> listaHotels=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        viewPager=(ViewPager)findViewById(R.id.vpSlide);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Featured featured=new Featured("https://68.media.tumblr.com/3ee9eb08b4840b640b248579957988f5/tumblr_ns65sx2srA1sp7sfwo1_500.gif","Skydiving","456");
        Featured featured1=new Featured("http://www.bloomyoganj.com/wp-content/uploads/2014/11/yoga-pose.jpg","Yoga","46");
        Featured featured2=new Featured("http://www.cdivanzamorano.cl/wp-content/uploads/2015/04/comida.jpg","Cuisine","436");
        Featured featured3=new Featured("http://www.leverhulmehotel.co.uk/wp-content/uploads/2015/07/spa-main-image.jpg","Spa","766");
        listaFeat.add(featured);
        listaFeat.add(featured1);
        listaFeat.add(featured2);
        listaFeat.add(featured3);
        Hotels hotels=new Hotels("http://memoflores.com/fotos-de-hoteles-05.jpg","Hotel1","324",listaHotels.size()+1);
        listaHotels.add(hotels);
        Hotels hotels1=new Hotels("http://a.otcdn.com/headers/ilusion/img/hoteles_destinia.jpg","Hotel2","3234",listaHotels.size()+1);
        listaHotels.add(hotels1);
        Hotels hotels2=new Hotels("http://www.issemym.gob.mx/sites/default/files/styles/galerias/public/1.jpg?itok=uBl3cKBY","Hotel3","184",listaHotels.size()+1);
        listaHotels.add(hotels2);
        Hotels hotels3=new Hotels("http://tourhotel.es/wp-content/uploads/2016/03/hotel4.jpg","Hotel4","980",listaHotels.size()+1);
        listaHotels.add(hotels3);


        slideAdapter = new SlideAdapter(getSupportFragmentManager());
        viewPager.setAdapter(slideAdapter);

    }
}
