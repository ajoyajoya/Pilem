package com.ajoyajoya.pilem.ui.detail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import java.util.Objects;

import jp.wasabeef.glide.transformations.BlurTransformation;

import static com.ajoyajoya.pilem.utils.GlideOptions.bitmapTransform;

public class DetailMovie extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    private NestedScrollView bgMovieDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        TextView tvMovieName = findViewById(R.id.txt_movie_name);
        TextView tvMovieRate = findViewById(R.id.txt_movie_rate);
        TextView tvMovieCat = findViewById(R.id.txt_movie_cat);
        TextView tvMovieDesc = findViewById(R.id.txt_movie_desc);
        ImageView imgMoviePoster = findViewById(R.id.img_poster_movie);
        ImageView imgTrailerLink = findViewById(R.id.img_trailer_link);
        bgMovieDetail = findViewById(R.id.bg_movie_detail);

        setActionBarTitle();

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String movieId = extras.getString(EXTRA_MOVIE);
            if (movieId != null) {

                char pilemType = movieId.charAt(0);

                switch (pilemType){
                    case 'm':
                        DetailMovieViewModel viewModel = ViewModelProviders.of(this).get(DetailMovieViewModel.class);
                        viewModel.setMovieId(Integer.parseInt(movieId));
                        MovieEntity mmovies = viewModel.getMovie();

                        tvMovieName.setText(mmovies.getMovieName());
                        tvMovieRate.setText(mmovies.getMovieRated());
                        tvMovieCat.setText(mmovies.getMovieCategory());
                        tvMovieDesc.setText(mmovies.getMovieDesc());

                        Glide.with(this).load(mmovies.getMoviePoster()).into(imgMoviePoster);
                        Glide.with(this).load(mmovies.getMoviePoster()).into(imgTrailerLink);

                        //noinspection deprecation
                        Glide.with(this).load(mmovies.getMoviePoster())
                                .apply(bitmapTransform(new BlurTransformation(25, 3)))
                                .into(new SimpleTarget<Drawable>() {
                                    @Override
                                    public void onResourceReady(@NonNull Drawable resource, Transition<? super Drawable> transition) {
                                        bgMovieDetail.setBackground(resource);
                                    }
                                });

                        float backgroundRating = Float.parseFloat(mmovies.getMovieRated());

                        if (backgroundRating>=8.0){
                            tvMovieRate.setTextColor(Color.parseColor("#3498db"));
                        } else if (backgroundRating>=7.0){
                            tvMovieRate.setTextColor(Color.parseColor("#2ecc71"));
                        } else if (backgroundRating>=6.0){
                            tvMovieRate.setTextColor(Color.parseColor("#f1c40f"));
                        } else if (backgroundRating>=5.0){
                            tvMovieRate.setTextColor(Color.parseColor("#e67e22"));
                        } else {
                            tvMovieRate.setTextColor(Color.parseColor("#e74c3c"));
                        }

                        break;

                    case 't':

                        viewModel = ViewModelProviders.of(this).get(DetailMovieViewModel.class);
                        viewModel.setTvshowId(Integer.parseInt(movieId));
                        TvshowEntity mtvshows = viewModel.getTvshow();

                        tvMovieName.setText(mtvshows.getTvName());
                        tvMovieRate.setText(mtvshows.getTvRated());
                        tvMovieCat.setText(mtvshows.getTvCategory());

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            tvMovieDesc.setText(Html.fromHtml(mtvshows.getTvDesc(), Html.FROM_HTML_MODE_COMPACT));
                        } else {
                            tvMovieDesc.setText(Html.fromHtml(mtvshows.getTvDesc()));
                        }


                        Glide.with(this).load(mtvshows.getTvPoster()).into(imgMoviePoster);
                        Glide.with(this).load(mtvshows.getTvPoster()).into(imgTrailerLink);

                        //noinspection deprecation
                        Glide.with(this).load(mtvshows.getTvPoster())
                                .apply(bitmapTransform(new BlurTransformation(25, 3)))
                                .into(new SimpleTarget<Drawable>() {
                                    @Override
                                    public void onResourceReady(@NonNull Drawable resource, Transition<? super Drawable> transition) {
                                        bgMovieDetail.setBackground(resource);
                                    }
                                });

                        float backgroundTvRating = Float.parseFloat(mtvshows.getTvRated());

                        if (backgroundTvRating>=8.0){
                            tvMovieRate.setTextColor(Color.parseColor("#3498db"));
                        } else if (backgroundTvRating>=7.0){
                            tvMovieRate.setTextColor(Color.parseColor("#2ecc71"));
                        } else if (backgroundTvRating>=6.0){
                            tvMovieRate.setTextColor(Color.parseColor("#f1c40f"));
                        } else if (backgroundTvRating>=5.0){
                            tvMovieRate.setTextColor(Color.parseColor("#e67e22"));
                        } else {
                            tvMovieRate.setTextColor(Color.parseColor("#e74c3c"));
                        }

                        break;
                }



            }
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
}
