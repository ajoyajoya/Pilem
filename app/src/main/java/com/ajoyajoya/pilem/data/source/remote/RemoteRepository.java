package com.ajoyajoya.pilem.data.source.remote;

import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;
import com.ajoyajoya.pilem.utils.EspressoIdlingResource;
import com.ajoyajoya.pilem.utils.JsonHelper;

import java.util.List;

public class RemoteRepository {

    private static RemoteRepository INSTANCE;
    private JsonHelper jsonHelper;

    public RemoteRepository(JsonHelper jsonHelper) {
        this.jsonHelper = jsonHelper;
    }

    public static RemoteRepository getInstance(JsonHelper helper) {
        if (INSTANCE == null) {
            INSTANCE = new RemoteRepository(helper);
        }
        return INSTANCE;
    }

    public void getAllMovies(LoadMoviesCallback callback) {
        EspressoIdlingResource.increment();

        ///jsonHelper.loadAllMovies();
        callback.onAllMoviesReceived(jsonHelper.loadMovies());

        EspressoIdlingResource.decrement();
        System.out.println("Dapat callback Movies" + jsonHelper.loadMovies().size());
    }

    public void getAllTvies(LoadTviesCallback callback) {
        callback.onAllTviesReceived(jsonHelper.loadTvshow());
    }

    public interface LoadMoviesCallback {
        void onAllMoviesReceived(List<MovieResponse> movieResponses);

        void onDataNotAvailable();
    }

    public interface LoadTviesCallback {
        void onAllTviesReceived(List<TvshowResponse> tviesResponses);

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
