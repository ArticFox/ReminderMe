package com.acore.remindme.tabAdabter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.acore.remindme.fragment.AbstractTabFragment;
import com.acore.remindme.fragment.BirthdayFragment;
import com.acore.remindme.fragment.HistoryFragment;
import com.acore.remindme.fragment.IdeaFragment;
import com.acore.remindme.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;


public class TabsPageFragmentAdapter extends FragmentPagerAdapter {
    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsPageFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeaFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
