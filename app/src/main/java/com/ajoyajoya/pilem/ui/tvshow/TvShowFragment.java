package com.ajoyajoya.pilem.ui.tvshow;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.ui.tvshow.TvShowViewModel;
import com.ajoyajoya.pilem.viewmodel.ViewModelFactory;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {

    private RecyclerView rvTvshow;
    private ProgressBar progressBar;


    public TvShowFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new TvShowFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvTvshow = view.findViewById(R.id.rv_list_tv);
        progressBar = view.findViewById(R.id.progress_bar);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        progressBar.setVisibility(View.VISIBLE);
        if (getActivity() != null) {
            TvShowViewModel tvShowViewModel = obtainViewModel(getActivity());


            TvShowAdapter tvShowAdapter = new TvShowAdapter(getActivity());

            tvShowViewModel.getAllTvShow().observe(this, tvies -> {
                tvShowAdapter.setListTvShow(tvies);
                tvShowAdapter.notifyDataSetChanged();
            });

            rvTvshow.setLayoutManager(new GridLayoutManager(getContext(),2));
            rvTvshow.setHasFixedSize(true);
            rvTvshow.setAdapter(tvShowAdapter);
        }
        progressBar.setVisibility(View.GONE);
    }

    private TvShowViewModel obtainViewModel(FragmentActivity activity) {
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());
        return ViewModelProviders.of(activity, factory).get(TvShowViewModel.class);
    }

}
