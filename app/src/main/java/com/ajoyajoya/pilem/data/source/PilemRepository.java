package com.ajoyajoya.pilem.data.source;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.remote.RemoteRepository;
import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;

import java.util.ArrayList;
import java.util.List;

public class PilemRepository implements PilemDataSource{

    private volatile static PilemRepository INSTANCE = null;

    private final RemoteRepository remoteRepository;

    private PilemRepository(@NonNull RemoteRepository remoteRepository) {
        this.remoteRepository = remoteRepository;
    }

    public static PilemRepository getInstance(RemoteRepository remoteData) {
        if (INSTANCE == null) {
            synchronized (PilemRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PilemRepository(remoteData);
                }
            }
        }
        return INSTANCE;
    }


    @Override
    public LiveData<List<MovieEntity>> getAllMovies() {
        MutableLiveData<List<MovieEntity>> movieResults = new MutableLiveData<>();
        remoteRepository.getAllMovies(new RemoteRepository.LoadMoviesCallback(){

            @Override
            public void onAllMoviesReceived(List<MovieResponse> movieResponses) {
                ArrayList<MovieEntity> movieList = new ArrayList<>();
                for (int i = 0; i < movieResponses.size(); i++) {
                    MovieResponse response = movieResponses.get(i);
                    MovieEntity movieEntity = new MovieEntity(response.getMovieId(),
                            response.getMoviePoster(),
                            response.getMovieName(),
                            response.getMovieRated(),
                            response.getMovieCategory(),
                            response.getMovieDesc());

                    System.out.println("Dapat Data Repository" + response.getMovieId()+ response.getMoviePoster()+ response.getMovieName() + response.getMovieRated() + response.getMovieCategory() + response.getMovieDesc());
                    movieList.add(movieEntity);
                }
                movieResults.postValue(movieList);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });

        return movieResults;
    }

    @Override
    public LiveData<List<TvshowEntity>> getAllTvies() {
        MutableLiveData<List<TvshowEntity>> tvResults = new MutableLiveData<>();

        remoteRepository.getAllTvies(new RemoteRepository.LoadTviesCallback(){

            @Override
            public void onAllTviesReceived(List<TvshowResponse> tviesResponses) {

                ArrayList<TvshowEntity> tvList = new ArrayList<>();
                for (int i = 0; i < tviesResponses.size(); i++) {
                    TvshowResponse response = tviesResponses.get(i);
                    TvshowEntity tvshowEntity = new TvshowEntity(response.getTvId(),
                            response.getTvDesc(),
                            response.getTvName(),
                            response.getTvRated(),
                            response.getTvCategory(),
                            response.getTvPoster());

                    tvList.add(tvshowEntity);
                }
                tvResults.postValue(tvList);

            }

            @Override
            public void onDataNotAvailable() {

            }
        });

        return tvResults;
    }
}
