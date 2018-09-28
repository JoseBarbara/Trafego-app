package com.rodrigoneves.trafegometro.app_fones;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        String linha;
        switch (position) {
            case 0:
                linha = "1";
                break;
            case 1:
                linha = "2";
                break;
            case 2:
                linha = "3";
                break;
            case 3:
                linha = "15";
                break;
            default:
                linha = "Apoio";
                break;
        }

        FonesFragment fragment = new FonesFragment();
        Bundle bundle = new Bundle();
        bundle.putString("fones", linha);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
