package com.demo.aac.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

/**
 * Created by guoxiaodong on 2020-02-03 19:55
 */
public class MyViewModel extends ViewModel {
    @Override
    protected void onCleared() {
        Log.d("gxd", "MyViewModel.onCleared-->");
    }
}
