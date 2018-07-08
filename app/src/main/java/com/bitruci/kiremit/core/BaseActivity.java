package com.bitruci.kiremit.core;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bitruci.kiremit.BuildConfig;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity extends DaggerAppCompatActivity {

    protected final static boolean DEBUG = BuildConfig.DEBUG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
