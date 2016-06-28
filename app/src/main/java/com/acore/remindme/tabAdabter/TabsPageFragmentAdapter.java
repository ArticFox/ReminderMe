package com.acore.remindme.tabAdabter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.acore.remindme.fragment.ExampleFragment;


public class TabsPageFragmentAdapter extends FragmentPagerAdapter {
    private String[] tabs;

    public TabsPageFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
          "Tabs 1",
          "Tabs 2",
          "Tabs 3",
          "Tabs 4"
        };

    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFragment.getInstance();

            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
            case 3:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }


}