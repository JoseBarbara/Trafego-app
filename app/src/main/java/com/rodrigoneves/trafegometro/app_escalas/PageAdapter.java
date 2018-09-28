package com.rodrigoneves.trafegometro.app_escalas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
                return new EscalasFragment();
        }

    @Override
    public int getCount() {
        return 1;
    }
}
