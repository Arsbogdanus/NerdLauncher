package com.brz.nerdlauncher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NerdLauncherFragment extends Fragment {
    private RecyclerView mRecyclerView;
    public static NerdLauncherFragment newInstance() {
        return new NerdLauncherFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_nerd_launcher, container,
            false);
<<<<<<< HEAD
        mRecyclerView = (RecyclerView) v.findViewById(R.id.app_recycler_view);
=======
        mRecyclerView = (RecyclerView) v.findViewById(ТR.id.app_recycler_view);
>>>>>>> origin/main
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }
}
