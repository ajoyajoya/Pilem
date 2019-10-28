package com.ajoyajoya.pilem.data.source.remote.response;

import android.os.Parcel;
import android.os.Parcelable;

public class TvshowResponse implements Parcelable {

    private int tvId;
    private String tvPoster;
    private String tvName;
    private String tvRated;
    private String tvCategory;
    private String tvDesc;
    private String releaseDate;

    public TvshowResponse(int tvId, String tvPoster, String tvName, String tvRated, String tvCategory, String tvDesc, String releaseDate) {
        this.tvId = tvId;
        this.tvPoster = tvPoster;
        this.tvName = tvName;
        this.tvRated = tvRated;
        this.tvCategory = tvCategory;
        this.tvDesc = tvDesc;
        this.releaseDate = releaseDate;
    }

    public int getTvId() {
        return tvId;
    }

    public void setTvId(int tvId) {
        this.tvId = tvId;
    }

    public String getTvPoster() {
        return tvPoster;
    }

    public void setTvPoster(String tvPoster) {
        this.tvPoster = tvPoster;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvRated() {
        return tvRated;
    }

    public void setTvRated(String tvRated) {
        this.tvRated = tvRated;
    }

    public String getTvCategory() {
        return tvCategory;
    }

    public void setTvCategory(String tvCategory) {
        this.tvCategory = tvCategory;
    }

    public String getTvDesc() {
        return tvDesc;
    }

    public void setTvDesc(String tvDesc) {
        this.tvDesc = tvDesc;
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
        dest.writeInt(tvId);
        dest.writeString(tvPoster);
        dest.writeString(tvName);
        dest.writeString(tvRated);
        dest.writeString(tvCategory);
        dest.writeString(tvDesc);
        dest.writeString(releaseDate);
    }

    protected TvshowResponse(Parcel in) {
        tvId = in.readInt();
        tvPoster = in.readString();
        tvName = in.readString();
        tvRated = in.readString();
        tvCategory = in.readString();
        tvDesc = in.readString();
        releaseDate = in.readString();
    }

    public static final Creator<TvshowResponse> CREATOR = new Creator<TvshowResponse>() {
        @Override
        public TvshowResponse createFromParcel(Parcel in) {
            return new TvshowResponse(in);
        }

        @Override
        public TvshowResponse[] newArray(int size) {
            return new TvshowResponse[size];
        }
    };
}
