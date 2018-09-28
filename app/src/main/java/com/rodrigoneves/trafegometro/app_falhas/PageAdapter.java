package com.rodrigoneves.trafegometro.app_falhas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        String frota;
        switch (position) {
            case 0:
                frota = "E";
                break;
            case 1:
                frota = "G";
                break;
            case 2:
                frota = "H";
                break;
            case 3:
                frota = "I";
                break;
            case 4:
                frota = "J";
                break;
            case 5:
                frota = "K";
                break;
            default:
                frota = "L";
                break;
        }
        FalhasFragment fragment = new FalhasFragment();
        Bundle bundle = new Bundle();
        bundle.putString("frotas", frota);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 7;
    }
}
