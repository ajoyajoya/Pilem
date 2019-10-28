package com.ajoyajoya.pilem.utils;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.source.remote.RemoteRepository;
import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class JsonHelper {

    private RemoteRepository remoteRepository;

    Application application;

    private static final String API_KEY = "6c850abf79ae2a311643afba9e9ff654";

    public List<MovieResponse> loadAllMovies = new ArrayList<>();

    public ArrayList<MovieResponse> listMovies = new ArrayList<>();

    public JsonHelper(Application application) {
        this.application = application;
    }

    public List<MovieResponse> loadMovies() {

        MutableLiveData<List<MovieResponse>> movieParsingResult = new MutableLiveData<>();

        AsyncHttpClient client = new AsyncHttpClient();

        String url = "https://api.themoviedb.org/3/movie/upcoming?api_key="+API_KEY;

        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    String result = new String(responseBody);
                    JSONObject responseObject = new JSONObject(result);
                    JSONArray list = responseObject.getJSONArray("results");
                    for (int i = 0; i < list.length(); i++) {
                        JSONObject movie = list.getJSONObject(i);

                        int movieId = movie.getInt("id");
                        String moviePoster = movie.getString("poster_path");
                        String movieName = movie.getString("original_title");
                        String movieRated = movie.getString("vote_average");
                        String movieCategory = movie.getString("genre_ids");
                        String movieDesc = movie.getString("overview");
                        String releaseDate = movie.getString("release_date");

                        MovieResponse movieResponse = new MovieResponse(movieId, moviePoster, movieName, movieRated, movieCategory, movieDesc, releaseDate);

                        listMovies.add(movieResponse);
                    }

                    loadAllMovies = listMovies;
                    movieParsingResult.postValue(listMovies);

                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());

                }



            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }


        });


        //END IN HERE ------------------------------------------------

//        System.out.println("Isi List Movie Entities" + listMovies.size());
//
//        return listMovies;


//        int movieId = 290859;
//        String moviePoster = "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg";
//        String movieName = "Aquaman (2018)";
//        String movieRated = "7.1";
//        String movieCategory = "PG-13 | 2h 23min | Action, Adventure, Fantasy | 21 December 2018 (USA)";
//        String movieDesc = "Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land. \\nArthur Curry, half human half from Atlantis, goes on a trip of a lifetime. Not only does this adventure compel him to come to terms with his real identity, but it also forces him to discover whether he is entirely worthy of fulfilling his own destiny: becoming a king.";
//        String releaseDate = "17 August 2019";
//
//        //System.out.println("Dapat Data " +movieId+moviePoster+movieName+movieRated+movieCategory+movieDesc+releaseDate);
//
//        MovieResponse movieResponse = new MovieResponse(movieId, moviePoster, movieName, movieRated, movieCategory, movieDesc, releaseDate);
//        //System.out.println("Movie Responnya "+movieResponse);
//
//        listMovies.add(movieResponse);

        return loadAllMovies;


    }


//    public List<MovieResponse> loadMovies(){
//
//        System.out.println("Isi Movie List Luar loadAll" + loadAllMovies.size());
//        return loadAllMovies;
//    }

    public List<TvshowResponse> loadTvshow() {
        ArrayList<TvshowResponse> listTvies = new ArrayList<>();
        AsyncHttpClient client = new AsyncHttpClient();

        String url = "https://api.themoviedb.org/3/tv/top_rated?api_key="+API_KEY;

        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    String result = new String(responseBody);
                    JSONObject responseObject = new JSONObject(result);
                    JSONArray list = responseObject.getJSONArray("results");
                    for (int i = 0; i < list.length(); i++) {
                        JSONObject movie = list.getJSONObject(i);

                        int tvId = movie.getInt("id");
                        String tvPoster = movie.getString("poster_path");
                        String tvName = movie.getString("original_title");
                        String tvRated = movie.getString("vote_average");
                        String tvCategory = movie.getString("genre_ids");
                        String tvDesc = movie.getString("overview");
                        String releaseDate = movie.getString("release_date");

                        TvshowResponse tvshowResponse = new TvshowResponse(tvId, tvPoster, tvName, tvRated, tvCategory, tvDesc, releaseDate);
                        listTvies.add(tvshowResponse);
                    }

                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());
                }
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }
        });

        return listTvies;

    }





}
