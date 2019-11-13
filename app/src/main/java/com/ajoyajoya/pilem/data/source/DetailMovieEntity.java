package com.ajoyajoya.pilem.data.source;

public class DetailMovieEntity {

    private int movieId;
    private String movieBackdrop;
    private String moviePoster;
    private String movieName;
    private String movieRated;
    private String movieCategory;
    private String movieDesc;
    private String releaseDate;

    private String crew1;
    private String crew2;
    private String job1;
    private String job2;

    private String videoTrailer;
    private String videoSource;

    public DetailMovieEntity(int movieId, String movieBackdrop, String moviePoster, String movieName, String movieRated, String movieCategory, String movieDesc, String releaseDate, String crew1, String crew2, String job1, String job2, String videoTrailer, String videoSource) {
        this.movieId = movieId;
        this.movieBackdrop = movieBackdrop;
        this.moviePoster = moviePoster;
        this.movieName = movieName;
        this.movieRated = movieRated;
        this.movieCategory = movieCategory;
        this.movieDesc = movieDesc;
        this.releaseDate = releaseDate;
        this.crew1 = crew1;
        this.crew2 = crew2;
        this.job1 = job1;
        this.job2 = job2;
        this.videoTrailer = videoTrailer;
        this.videoSource = videoSource;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieBackdrop() {
        return movieBackdrop;
    }

    public void setMovieBackdrop(String movieBackdrop) {
        this.movieBackdrop = movieBackdrop;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCrew1() {
        return crew1;
    }

    public void setCrew1(String crew1) {
        this.crew1 = crew1;
    }

    public String getCrew2() {
        return crew2;
    }

    public void setCrew2(String crew2) {
        this.crew2 = crew2;
    }

    public String getJob1() {
        return job1;
    }

    public void setJob1(String job1) {
        this.job1 = job1;
    }

    public String getJob2() {
        return job2;
    }

    public void setJob2(String job2) {
        this.job2 = job2;
    }

    public String getVideoTrailer() {
        return videoTrailer;
    }

    public void setVideoTrailer(String videoTrailer) {
        this.videoTrailer = videoTrailer;
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(String videoSource) {
        this.videoSource = videoSource;
    }

}
