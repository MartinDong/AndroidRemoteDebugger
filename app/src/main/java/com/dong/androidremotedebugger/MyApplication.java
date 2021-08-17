package com.dong.androidremotedebugger;

import android.app.Application;
import zerobranch.androidremotedebugger.AndroidRemoteDebugger;
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidRemoteDebugger.init(this);
    }
}
