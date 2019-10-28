package com.ajoyajoya.pilem.ui.tvshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.utils.DataPilem;

import java.util.List;

public class TvShowViewModel extends ViewModel {

    private PilemRepository pilemRepository;

    public TvShowViewModel(PilemRepository mPilemRepository) {
        this.pilemRepository = mPilemRepository;
    }

//    public List<TvshowEntity> getAllTvShow(){
//        return pilemRepository.getAllTvies();
//    }

    public List<TvshowEntity> getTvShow() {
        return DataPilem.generatePilemTvshow();
    }

    LiveData<List<TvshowEntity>> getAllTvShow() {
        return pilemRepository.getAllTvies();
    }
}
