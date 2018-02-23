package com.example.mydeveloper.jadwalkuliah;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mydeveloper.jadwalkuliah.fragment.JumatFragment;
import com.example.mydeveloper.jadwalkuliah.fragment.KamisFragment;
import com.example.mydeveloper.jadwalkuliah.fragment.SelasaFragment;
import com.example.mydeveloper.jadwalkuliah.fragment.SeninFragment;

/**
 * Created by MyDeveloper on 2/21/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SeninFragment();
        } else if (position == 1){
            return new SelasaFragment();
        } else if (position == 2) {
            return new KamisFragment();
        } else {
            return new JumatFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}