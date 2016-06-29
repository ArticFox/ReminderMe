package com.acore.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.acore.remindme.R;

public class BirthdayFragment extends AbstractTabFragment {
    private static final int FRAGMENT_EXAMPLE = R.layout.fragment_example;

    public static BirthdayFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthday));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(FRAGMENT_EXAMPLE, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
