package com.example.brian.byblos;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Brian on 2/6/2016.
 */
public class ViewPagerActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_crime_pager);
        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_crime_view_pager);
        viewPager.setAdapter(new MyViewPagerAdapter(this));
    }
}
