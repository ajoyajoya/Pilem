package com.ajoyajoya.pilem.data;

public class MovieEntity {

    private String movieId;
    private int moviePoster;
    private String movieName;
    private String movieRated;
    private String movieCategory;
    private String movieDesc;

    public MovieEntity(String movieId, int moviePoster, String movieName, String movieRated, String movieCategory, String movieDesc) {
        this.movieId = movieId;
        this.moviePoster = moviePoster;
        this.movieName = movieName;
        this.movieRated = movieRated;
        this.movieCategory = movieCategory;
        this.movieDesc = movieDesc;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(int moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRated() {
        return movieRated;
    }

    public void setMovieRated(String movieRated) {
        this.movieRated = movieRated;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }
}
