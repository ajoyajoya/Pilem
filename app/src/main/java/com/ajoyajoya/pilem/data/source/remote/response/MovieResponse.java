package com.ajoyajoya.pilem.data.source.remote.response;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieResponse implements Parcelable {

    private int movieId;
    private String moviePoster;
    private String movieName;
    private String movieRated;
    private String movieCategory;
    private String movieDesc;
    private String releaseDate;

    public MovieResponse(int movieId, String moviePoster, String movieName, String movieRated, String movieCategory, String movieDesc, String releaseDate) {
        this.movieId = movieId;
        this.moviePoster = moviePoster;
        this.movieName = movieName;
        this.movieRated = movieRated;
        this.movieCategory = movieCategory;
        this.movieDesc = movieDesc;
        this.releaseDate = releaseDate;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(movieId);
        dest.writeString(moviePoster);
        dest.writeString(movieName);
        dest.writeString(movieRated);
        dest.writeString(movieCategory);
        dest.writeString(movieDesc);
        dest.writeString(releaseDate);
    }

    @SuppressWarnings("WeakerAccess")
    public MovieResponse(Parcel in) {
        movieId = in.readInt();
        moviePoster = in.readString();
        movieName = in.readString();
        movieRated = in.readString();
        movieCategory = in.readString();
        movieDesc = in.readString();
        releaseDate = in.readString();
    }

    public static final Creator<MovieResponse> CREATOR = new Creator<MovieResponse>() {
        @Override
        public MovieResponse createFromParcel(Parcel in) {
            return new MovieResponse(in);
        }

        @Override
        public MovieResponse[] newArray(int size) {
            return new MovieResponse[size];
        }
    };

}
