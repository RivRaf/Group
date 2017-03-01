package com.example.rafael.group.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.rafael.group.Fragments.SlideFragment;
import com.example.rafael.group.Fragments.SlideFragment2;
import com.example.rafael.group.SlideActivity;

/**
 * Created by RAFAEL on 01/03/2017.
 */

public class SlideAdapter extends FragmentStatePagerAdapter {
    public SlideAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0: return SlideFragment.newInstance("SlideFragment, Instance 1");
            case 1: return SlideFragment2.newInstance("SlideFragment, Instance 1");
            default: return SlideFragment.newInstance("SlideFragment, Default");
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
