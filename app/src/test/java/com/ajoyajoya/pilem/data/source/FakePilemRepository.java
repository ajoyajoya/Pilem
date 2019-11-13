package com.ajoyajoya.pilem.data.source;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ajoyajoya.pilem.data.DetailMovieItems;
import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.remote.RemoteRepository;
import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;

import java.util.ArrayList;
import java.util.List;

public class FakePilemRepository implements PilemDataSource{

    private volatile static FakePilemRepository INSTANCE = null;

    private final RemoteRepository remoteRepository;

    FakePilemRepository(@NonNull RemoteRepository remoteRepository) {
        this.remoteRepository = remoteRepository;
    }

    public static FakePilemRepository getInstance(RemoteRepository remoteData) {
        if (INSTANCE == null) {
            synchronized (FakePilemRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FakePilemRepository(remoteData);
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

                    //System.out.println("Dapat Data Repository" + response.getMovieId()+ response.getMoviePoster()+ response.getMovieName() + response.getMovieRated() + response.getMovieCategory() + response.getMovieDesc());
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
                            response.getTvPoster(),
                            response.getTvName(),
                            response.getTvRated(),
                            response.getTvCategory(),
                            response.getTvDesc());

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

    @Override
    public LiveData<List<DetailMovieEntity>> getDetailMovies(int idMovie){

        MutableLiveData<List<DetailMovieEntity>> movieResults = new MutableLiveData<>();

        remoteRepository.getDetailMovies(idMovie, new RemoteRepository.LoadDetailMoviesCallback(){

            @Override
            public void onAllMoviesReceived(List<DetailMovieItems> movieResponses) {
                ArrayList<DetailMovieEntity> movieList = new ArrayList<>();
                movieList.clear();
                for (int i = 0; i < movieResponses.size(); i++) {
                    DetailMovieItems response = movieResponses.get(i);
                    DetailMovieEntity detailMovieEntity = new DetailMovieEntity(response.getMovieId(),
                            response.getMovieBackdrop(),
                            response.getMoviePoster(),
                            response.getMovieName(),
                            response.getMovieRated(),
                            response.getMovieCategory(),
                            response.getMovieDesc(),
                            response.getReleaseDate(),
                            response.getCrew1(),
                            response.getCrew2(),
                            response.getJob1(),
                            response.getJob2(),
                            response.getVideoTrailer(),
                            response.getVideoSource());
                    movieList.clear();
                    movieList.add(detailMovieEntity);
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
    public LiveData<List<DetailMovieEntity>> getDetailTvies(int idMovie){

        MutableLiveData<List<DetailMovieEntity>> tvResults = new MutableLiveData<>();

        remoteRepository.getDetailTvies(idMovie, new RemoteRepository.LoadDetailTviesCallback(){

            @Override
            public void onAllTviesReceived(List<DetailMovieItems> tviesResponses) {
                ArrayList<DetailMovieEntity> tvList = new ArrayList<>();
                tvList.clear();
                for (int i = 0; i < tviesResponses.size(); i++) {
                    DetailMovieItems response = tviesResponses.get(i);
                    DetailMovieEntity tvshowEntity = new DetailMovieEntity(response.getMovieId(),
                            response.getMovieBackdrop(),
                            response.getMoviePoster(),
                            response.getMovieName(),
                            response.getMovieRated(),
                            response.getMovieCategory(),
                            response.getMovieDesc(),
                            response.getReleaseDate(),
                            response.getCrew1(),
                            response.getCrew2(),
                            response.getJob1(),
                            response.getJob2(),
                            response.getVideoTrailer(),
                            response.getVideoSource());

                    tvList.clear();
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
