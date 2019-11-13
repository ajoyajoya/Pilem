package com.ajoyajoya.pilem.data.source.remote;

import android.util.Log;

import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;
import com.ajoyajoya.pilem.utils.JsonHelper;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


import cz.msebera.android.httpclient.Header;

public class TvRepository {

    private static TvRepository INSTANCE;
    private static final String API_KEY = "6c850abf79ae2a311643afba9e9ff654";

    private ArrayList<TvshowResponse> listTvies = new ArrayList<>();


    private TvRepository(JsonHelper jsonHelper) {
    }

    public static TvRepository getInstance(JsonHelper helper) {
        if (INSTANCE == null) {
            INSTANCE = new TvRepository(helper);
        }
        return INSTANCE;
    }


    public void getAllTvies(LoadTviesCallback callbackTv) {
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

                        int movieId = movie.getInt("id");
                        String moviePoster = movie.getString("poster_path");
                        String movieName = movie.getString("original_name");
                        String movieRated = movie.getString("vote_average");
                        String movieCategory = movie.getString("first_air_date");
                        String movieDesc = movie.getString("overview");
                        String releaseDate = movie.getString("first_air_date");

                        System.out.println("Dapat Data " +movieId+moviePoster+movieName+movieRated+movieCategory+movieDesc+releaseDate);
                        TvshowResponse tvshowResponse = new TvshowResponse(movieId, moviePoster, movieName, movieRated, movieCategory, movieDesc, releaseDate);

                        listTvies.add(tvshowResponse);
                    }

                    System.out.println("Tv Responnya "+listTvies);
                    callbackTv.onAllTviesReceived(listTvies);

                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());

                }


            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }

        });

        System.out.println("Tv Responnya Luar "+listTvies);

        callbackTv.onAllTviesReceived(listTvies);
    }


    @SuppressWarnings("WeakerAccess")
    public interface LoadTviesCallback {
        void onAllTviesReceived(List<TvshowResponse> tviesResponses);

        void onDataNotAvailable();
    }

}
