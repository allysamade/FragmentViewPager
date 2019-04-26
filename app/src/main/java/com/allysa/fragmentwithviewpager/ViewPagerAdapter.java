package com.allysa.fragmentwithviewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//classViewPagerAapter is a class for initialize Fragment that extended from Fragment Adapter

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public final int PAGE_COUNT = 4;
    public String tabTitle[] = new String[]{"CHAT", "STATUS", "PANGGILAN", "WEB VIEW"};

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super (fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fr = null;
        switch(position){
            case 0:
                fr = new ChatFragment();
                break;
            case 1:
                fr = new StatusFragment();
                break;
            case 2:
                fr = new PanggilanFragment();
                break;
            case 3:
                fr = new WebFragment();
                break;

        }
        return fr;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position){

        return tabTitle[position];
    }
}
