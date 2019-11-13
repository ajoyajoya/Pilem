package com.ajoyajoya.pilem.ui.tvshow;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.utils.FakeDataPilemDummy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TvShowViewModelTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    private TvShowViewModel viewModel;
    private PilemRepository pilemRepository = mock(PilemRepository.class);


    @Before
    public void setUp() {
        viewModel = new TvShowViewModel(pilemRepository);
    }

    @Test
    public void getTvshow() {
        List<TvshowEntity> tvshowEntities = FakeDataPilemDummy.generatePilemTvshow();

        MutableLiveData<List<TvshowEntity>> tvies = new MutableLiveData<>();
        tvies.setValue(tvshowEntities);

        when(pilemRepository.getAllTvies()).thenReturn(tvies);

        Observer<List<TvshowEntity>> observer = mock(Observer.class);

        viewModel.getAllTvShow().observeForever(observer);

        verify(observer).onChanged(tvshowEntities);

        assertNotNull(tvshowEntities);
        assertEquals(10, tvshowEntities.size());
    }

}