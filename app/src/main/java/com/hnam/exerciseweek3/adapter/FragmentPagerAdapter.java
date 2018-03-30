package com.hnam.exerciseweek3.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.hnam.exerciseweek3.Constants;
import com.hnam.exerciseweek3.fragment.MovieFragment;

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private static final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[]{Constants.TAG_NOW_PLAYING, Constants.TAG_TOP_RATE};

    private Context context;

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return MovieFragment.newInstance(tabTitles[position]);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
