package com.ajoyajoya.pilem.ui.movie;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.viewmodel.ViewModelFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    private RecyclerView rvMovie;
    private ProgressBar progressBar;
    ListMovieAdapter movieAdapter;
    MovieViewModel movieViewModel;


    public MovieFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new MovieFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMovie = view.findViewById(R.id.rv_list_movie);
        progressBar = view.findViewById(R.id.progress_bar);
        progressBar.getIndeterminateDrawable().setColorFilter(0xFF8C1127,android.graphics.PorterDuff.Mode.MULTIPLY);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {

            movieViewModel = obtainViewModel(getActivity());

            movieAdapter = new ListMovieAdapter(getActivity());

            movieViewModel.getMoviesAll().observe(this, movies -> {
                System.out.println("Apakah Ada Data "+movies);

//                List<MovieEntity> movieEntities = new ArrayList<>();
//                movieEntities.clear();
//                movieEntities.add(new MovieEntity(2,"https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg","Aquaman (2018)", "7.1", "PG-13 | 2h 23min | Action, Adventure, Fantasy | 21 December 2018 (USA)", "Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land. \\nArthur Curry, half human half from Atlantis, goes on a trip of a lifetime. Not only does this adventure compel him to come to terms with his real identity, but it also forces him to discover whether he is entirely worthy of fulfilling his own destiny: becoming a king."));
//                movieEntities.get(0).setMovieId(2);
//                movieEntities.get(0).setMovieName("Aquaman (2018)");
//                movieEntities.get(0).setMovieRated("7.1");
//                movieEntities.get(0).setMovieCategory("PG-13 | 2h 23min | Action, Adventure, Fantasy | 21 December 2018 (USA)");
//                movieEntities.get(0).setMovieDesc("Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land. \\nArthur Curry, half human half from Atlantis, goes on a trip of a lifetime. Not only does this adventure compel him to come to terms with his real identity, but it also forces him to discover whether he is entirely worthy of fulfilling his own destiny: becoming a king.");

                progressBar.setVisibility(View.GONE);
                movieAdapter.setListMovie(movies);
                movieAdapter.notifyDataSetChanged();
            });


            rvMovie.setLayoutManager(new LinearLayoutManager(getContext()));
            rvMovie.setHasFixedSize(true);
            rvMovie.setAdapter(movieAdapter);
        }
    }

    private MovieViewModel obtainViewModel(FragmentActivity activity) {
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());
        return ViewModelProviders.of(activity, factory).get(MovieViewModel.class);
    }

}
