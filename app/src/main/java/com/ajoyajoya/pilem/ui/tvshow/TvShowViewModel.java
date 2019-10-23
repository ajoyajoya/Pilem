package com.ajoyajoya.pilem.ui.tvshow;

import androidx.lifecycle.ViewModel;

import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.utils.DataPilem;

import java.util.List;

public class TvShowViewModel extends ViewModel {
    public List<TvshowEntity> getTvShow() {
        return DataPilem.generatePilemTvshow();
    }
}
