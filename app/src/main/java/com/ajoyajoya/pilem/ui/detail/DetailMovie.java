package com.ajoyajoya.pilem.ui.detail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.viewmodel.ViewModelFactory;

import java.util.Objects;

public class DetailMovie extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    private RecyclerView rvPilem;
    private ProgressBar progressBar;
    //DetailMovieAdapter pilemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        rvPilem = findViewById(R.id.rv_list_pilem);
        progressBar = findViewById(R.id.progress_bar);
        progressBar.getIndeterminateDrawable().setColorFilter(0xFF8C1127,android.graphics.PorterDuff.Mode.MULTIPLY);

        setActionBarTitle();

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Bundle extras = getIntent().getExtras();

        DetailMovieViewModel detailMovieViewModel = obtainViewModel(this);
        DetailMovieAdapter pilemAdapter = new DetailMovieAdapter(this);

        if (extras != null) {
            String movieId = extras.getString(EXTRA_MOVIE);
            if (movieId != null) {

                char pilemType = movieId.charAt(0);
                int idPilem = Integer.parseInt(movieId.substring(1));
                System.out.println(idPilem);

                showLoading(true);

                detailMovieViewModel.setMovieId(idPilem);

                switch (pilemType){
                    case 'm':

                        //Toast.makeText(getApplicationContext(),"Movie Detail" + idPilem,Toast.LENGTH_LONG).show();

                        detailMovieViewModel.getMoviesDetail().observe(this, detailMovies -> {

                            showLoading(false);
                            pilemAdapter.setListMovie(detailMovies);
                            pilemAdapter.notifyDataSetChanged();

                            System.out.println("Dari Fragment Movies" + detailMovies);

                            rvPilem.setLayoutManager(new LinearLayoutManager(this));
                            rvPilem.setHasFixedSize(true);
                            rvPilem.setAdapter(pilemAdapter);

                        });

                        break;

                    case 't':

                        //Toast.makeText(getApplicationContext(),"TV Show Detail" + idPilem,Toast.LENGTH_LONG).show();

                        detailMovieViewModel.getTviesDetail().observe(this, detailTvies -> {

                            showLoading(false);
                            pilemAdapter.setListMovie(detailTvies);
                            pilemAdapter.notifyDataSetChanged();

                            System.out.println("Dari Fragment Movies" + detailTvies);

                            rvPilem.setLayoutManager(new LinearLayoutManager(this));
                            rvPilem.setHasFixedSize(true);
                            rvPilem.setAdapter(pilemAdapter);

                        });

                        break;
                }



            }



        }


    }

    private void showLoading(Boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }


    private void setActionBarTitle(){
        Objects.requireNonNull(getSupportActionBar()).setTitle("Detail Movie");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    @NonNull
    private static DetailMovieViewModel obtainViewModel(AppCompatActivity activity) {
        // Use a Factory to inject dependencies into the ViewModel
        ViewModelFactory factory = ViewModelFactory.getInstance(activity.getApplication());

        return ViewModelProviders.of(activity, factory).get(DetailMovieViewModel.class);
    }
}
