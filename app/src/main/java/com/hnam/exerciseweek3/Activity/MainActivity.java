package com.hnam.exerciseweek3.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.hnam.exerciseweek3.R;
import com.hnam.exerciseweek3.adapter.FragmentPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "main";

    @BindView(R.id.movie_tabs)
    TabLayout movieTabs;
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Movies");
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(), this));
        viewPager.setOffscreenPageLimit(2);
        movieTabs.setupWithViewPager(viewPager);
    }

}
