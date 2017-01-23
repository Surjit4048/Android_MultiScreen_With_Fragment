package com.studatta.rq.miwok_in_fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewpager = (ViewPager) findViewById(R.id.am_viewpager);
        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager(), this);
        viewpager.setAdapter(customPagerAdapter);
        TabLayout tableLayout = (TabLayout) findViewById(R.id.am_tab_layout);
        tableLayout.setupWithViewPager(viewpager);
    }
}
