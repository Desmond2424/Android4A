package com.example.android4a.Vue;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android4a.Controller.MainController;
import com.example.android4a.Injection;
import com.example.android4a.Modèle.Data;
import com.example.android4a.R;

import java.util.List;

public class

FourthFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fourthfragment_layout, container, false);

        //        setContentView(R.layout.secondfragment_layout);
        recyclerView = view.findViewById(R.id.my_recycler_view);

        MainController controller = new MainController(this, Injection.getRestApiInstance());
        controller.start();

        return view;
    }

    public void loadList(List<Data> joblist) {
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(joblist, getContext());
        recyclerView.setAdapter(mAdapter);
    }
}
