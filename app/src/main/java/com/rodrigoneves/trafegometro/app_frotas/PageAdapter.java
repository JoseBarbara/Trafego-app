package com.rodrigoneves.trafegometro.app_frotas;

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
        String sortOrder;
        if (position == 0) {
            sortOrder = "linha";
        } else {
            sortOrder = "frota";
        }
        FrotasFragment fragment = new FrotasFragment();
        Bundle bundle = new Bundle();
        bundle.putString("sortOrder", sortOrder);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}