package com.ajoyajoya.pilem.data;

public class TvshowEntity {

    private String tvId;
    private int tvPoster;
    private String tvName;
    private String tvRated;
    private String tvCategory;
    private String tvDesc;

    public TvshowEntity(String tvId, String tvDesc, String tvName, String tvRated, String tvCategory, int tvPoster) {
        this.tvId = tvId;
        this.tvPoster = tvPoster;
        this.tvName = tvName;
        this.tvRated = tvRated;
        this.tvCategory = tvCategory;
        this.tvDesc = tvDesc;
    }


    public String getTvId() {
        return tvId;
    }

    public void setTvId(String tvId) {
        this.tvId = tvId;
    }

    public int getTvPoster() {
        return tvPoster;
    }

    public void setTvPoster(int tvPoster) {
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
