package com.acore.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.acore.remindme.R;
import com.acore.remindme.dto.RemindDTO;
import com.acore.remindme.tabAdabter.RemindListAdapter;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AbstractTabFragment {
    private static final int FRAGMENT_EXAMPLE = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(FRAGMENT_EXAMPLE, container, false);
        RecyclerView recView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recView.setLayoutManager(new LinearLayoutManager(context));
        recView.setAdapter(new RemindListAdapter(createMockData()));
        return view;
    }

    // метод-заглушка для проверки
    private List<RemindDTO> createMockData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));
        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
