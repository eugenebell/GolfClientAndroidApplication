package com.symphony;

import org.apache.cordova.DroidGap;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

public class GolfClientAppActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
   			 WindowManager.LayoutParams.FLAG_FULLSCREEN | 
   			 WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
    	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    	super.setIntegerProperty("splashscreen", R.drawable.golfsplashscreen);
    	super.loadUrl("file:///android_asset/www/index.html", 3000);    	
    }
}