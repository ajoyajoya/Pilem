package com.ajoyajoya.pilem.ui.tvshow;

import com.ajoyajoya.pilem.data.TvshowEntity;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TvShowViewModelTest {

    private TvShowViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new TvShowViewModel();
    }

    @Test
    public void getTvshow() {
        List<TvshowEntity> tvshowEntities = viewModel.getTvShow();
        assertNotNull(tvshowEntities);
        assertEquals(10, tvshowEntities.size());
    }

}