package com.ajoyajoya.pilem.di;

import android.app.Application;

import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.data.source.remote.RemoteRepository;
import com.ajoyajoya.pilem.utils.JsonHelper;

public class Injection {
    public static PilemRepository provideRepository(Application application) {

        RemoteRepository remoteRepository = RemoteRepository.getInstance(new JsonHelper(application));
        return PilemRepository.getInstance(remoteRepository);
    }
}
