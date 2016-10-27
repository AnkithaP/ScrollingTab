package com.aryaan.ankitha.scrollingtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentManager manager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(manager));
    }
}

class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //Log.d("ANKI","get Item is called");
        Fragment fragment = null;
        if (position == 0){
            fragment = new FragmentA();
        }
        if (position == 1){
            fragment = new FragmentB();
        }
        if (position == 2){
            fragment = new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        //Log.d("ANKI","get count is called");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "TAB 1";
        }
        if (position == 1){
            return "TAB 2";
        }
        if (position == 2){
            return "TAB 3";
        }
        return null;
    }
}
