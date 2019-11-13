package com.ajoyajoya.pilem.data;

public class TvshowEntity {

    private int tvId;
    private String tvPoster;
    private String tvName;
    private String tvRated;
    private String tvCategory;
    private String tvDesc;

    public TvshowEntity(int tvId, String tvPoster, String tvName, String tvRated, String tvCategory, String tvDesc) {
        this.tvId = tvId;
        this.tvPoster = tvPoster;
        this.tvName = tvName;
        this.tvRated = tvRated;
        this.tvCategory = tvCategory;
        this.tvDesc = tvDesc;
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


}
