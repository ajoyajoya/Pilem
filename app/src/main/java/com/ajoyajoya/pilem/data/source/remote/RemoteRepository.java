package com.ajoyajoya.pilem.data.source.remote;

import android.os.Handler;
import android.util.Log;

import com.ajoyajoya.pilem.BuildConfig;
import com.ajoyajoya.pilem.data.DetailMovieItems;
import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;
import com.ajoyajoya.pilem.utils.EspressoIdlingResource;
import com.ajoyajoya.pilem.utils.JsonHelper;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

@SuppressWarnings("ALL")
public class RemoteRepository {

    private static RemoteRepository INSTANCE;
    private final long SERVICE_LATENCY_IN_MILLIS2 = 5000;

    private static final String API_KEY = BuildConfig.API_KEY;
    public List<MovieResponse> listMovies = new ArrayList<>();
    public List<TvshowResponse> listTvies = new ArrayList<>();
    public List<DetailMovieItems> listDetailMovies = new ArrayList<>();
    public List<TvshowResponse> listDetailTvies = new ArrayList<>();


    public RemoteRepository(JsonHelper jsonHelper) {
    }

    public static RemoteRepository getInstance(JsonHelper helper) {
        if (INSTANCE == null) {
            INSTANCE = new RemoteRepository(helper);
        }
        return INSTANCE;
    }

    public void getAllMovies(LoadMoviesCallback callback) {
        EspressoIdlingResource.increment();
        Handler handler = new Handler();
        AsyncHttpClient client = new AsyncHttpClient();

        String url = BuildConfig.URL_API_MOVIE+API_KEY;

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
                        String movieCategory = movie.getString("release_date");
                        String movieDesc = movie.getString("overview");
                        String releaseDate = movie.getString("release_date");

                        MovieResponse movieResponse = new MovieResponse(movieId, moviePoster, movieName, movieRated, movieCategory, movieDesc, releaseDate);

                        listMovies.add(movieResponse);
                    }

                    callback.onAllMoviesReceived(listMovies);


                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());

                }


            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }

        });

        long SERVICE_LATENCY_IN_MILLIS = 3000;
        handler.postDelayed(() -> {
            callback.onAllMoviesReceived(listMovies);
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS);


    }

    public void getAllTvies(LoadTviesCallback callbackTv) {
        EspressoIdlingResource.increment();
        Handler handler2 = new Handler();
        AsyncHttpClient client = new AsyncHttpClient();

        String url = BuildConfig.URL_API_TVSHOW+API_KEY;

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

                        TvshowResponse tvshowResponse = new TvshowResponse(movieId, moviePoster, movieName, movieRated, movieCategory, movieDesc, releaseDate);

                        listTvies.add(tvshowResponse);
                    }

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

        handler2.postDelayed(() -> {
            callbackTv.onAllTviesReceived(listTvies);
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS2);

    }

    public void getDetailMovies(int idMovie, LoadDetailMoviesCallback callback){

        EspressoIdlingResource.increment();
        Handler handler2 = new Handler();
        AsyncHttpClient client = new AsyncHttpClient();

        String url = BuildConfig.DETAIL_MOVIE+idMovie+"?api_key="+API_KEY;
        final String url2 = BuildConfig.DETAIL_MOVIE+idMovie+"/credits?api_key="+API_KEY;
        final String url3 = BuildConfig.DETAIL_MOVIE+idMovie+"/videos?api_key="+API_KEY;

        client.get(url, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    final String result = new String(responseBody);
                    JSONObject [] responseObject = new JSONObject[4];

                    client.get(url2, new AsyncHttpResponseHandler() {
                        @Override
                        public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                            try {
                                final String result2 = new String(responseBody);
                                JSONObject [] responseObject = new JSONObject[4];

                                client.get(url3, new AsyncHttpResponseHandler() {
                                    @Override
                                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                                        try {


                                            String result3 = new String(responseBody);
                                            JSONObject [] responseObject = new JSONObject[4];

                                            responseObject[0] = new JSONObject(result);
                                            responseObject[1] = new JSONObject(result2);
                                            responseObject[2] = new JSONObject(result3);
                                            responseObject[3] = responseObject[0].put("type_detail","moviedetail");

                                            System.out.println("Result 1"+responseObject[0]);
                                            System.out.println("Result 2"+responseObject[1]);
                                            System.out.println("Result 3"+responseObject[2]);

                                            DetailMovieItems detailMovieItems = new DetailMovieItems(responseObject);
                                            listDetailMovies.clear();
                                            listDetailMovies.add(detailMovieItems);

                                            callback.onAllMoviesReceived(listDetailMovies);

                                        } catch (Exception e) {
                                            Log.d("Exception", e.getMessage());
                                        }
                                    }

                                    @Override
                                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                                        Log.d("onFailure", error.getMessage());
                                    }
                                });

                            } catch (Exception e) {
                                Log.d("Exception", e.getMessage());
                            }
                        }

                        @Override
                        public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                            Log.d("onFailure", error.getMessage());
                        }
                    });


                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }
        });

        handler2.postDelayed(() -> {
            callback.onAllMoviesReceived(listDetailMovies);
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS2);

    }

    public void getDetailTvies(int idMovie, LoadDetailTviesCallback callback){

        EspressoIdlingResource.increment();
        Handler handler2 = new Handler();
        AsyncHttpClient client = new AsyncHttpClient();

        String url = BuildConfig.DETAIL_TVSHOW+idMovie+"?api_key="+API_KEY;
        final String url2 = BuildConfig.DETAIL_TVSHOW+idMovie+"/credits?api_key="+API_KEY;
        final String url3 = BuildConfig.DETAIL_TVSHOW+idMovie+"/videos?api_key="+API_KEY;

        client.get(url, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    final String result = new String(responseBody);
                    JSONObject [] responseObject = new JSONObject[4];

                    client.get(url2, new AsyncHttpResponseHandler() {
                        @Override
                        public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                            try {
                                final String result2 = new String(responseBody);
                                JSONObject [] responseObject = new JSONObject[4];

                                client.get(url3, new AsyncHttpResponseHandler() {
                                    @Override
                                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                                        try {


                                            String result3 = new String(responseBody);
                                            JSONObject [] responseObject = new JSONObject[4];

                                            responseObject[0] = new JSONObject(result);
                                            responseObject[1] = new JSONObject(result2);
                                            responseObject[2] = new JSONObject(result3);
                                            responseObject[3] = responseObject[0].put("type_detail","tvshowdetail");

                                            System.out.println("Result 1"+responseObject[0]);
                                            System.out.println("Result 2"+responseObject[1]);
                                            System.out.println("Result 3"+responseObject[2]);

                                            DetailMovieItems detailMovieItems = new DetailMovieItems(responseObject);
                                            listDetailMovies.clear();
                                            listDetailMovies.add(detailMovieItems);

                                            callback.onAllTviesReceived(listDetailMovies);

                                        } catch (Exception e) {
                                            Log.d("Exception", e.getMessage());
                                        }
                                    }

                                    @Override
                                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                                        Log.d("onFailure", error.getMessage());
                                    }
                                });

                            } catch (Exception e) {
                                Log.d("Exception", e.getMessage());
                            }
                        }

                        @Override
                        public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                            Log.d("onFailure", error.getMessage());
                        }
                    });


                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }
        });

        handler2.postDelayed(() -> {
            callback.onAllTviesReceived(listDetailMovies);
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS2);

    }

    @SuppressWarnings("EmptyMethod")
    public interface LoadMoviesCallback {
        void onAllMoviesReceived(List<MovieResponse> movieResponses);

        @SuppressWarnings("EmptyMethod")
        void onDataNotAvailable();
    }

    @SuppressWarnings("EmptyMethod")
    public interface LoadTviesCallback {
        void onAllTviesReceived(List<TvshowResponse> tviesResponses);

        void onDataNotAvailable();
    }

    @SuppressWarnings("EmptyMethod")
    public interface LoadDetailMoviesCallback {
        void onAllMoviesReceived(List<DetailMovieItems> movieResponses);

        void onDataNotAvailable();
    }

    @SuppressWarnings("EmptyMethod")
    public interface LoadDetailTviesCallback {
        void onAllTviesReceived(List<DetailMovieItems> tviesResponses);

        void onDataNotAvailable();
    }






//
//    public List<MovieResponse> getAllMovies() {
//        return jsonHelper.loadMovies();
//    }
//
//    public List<TvshowResponse> getAllTvies(){
//        return jsonHelper.loadTvshow();
//    }
//

}
