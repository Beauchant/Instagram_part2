package com.example.instagram_part1;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("irlCMh8Rpmk18sD6WOYKBDHWwvEYfeUGM0M3LMnP")
                .clientKey("OkJqjIzz2U0onsCX05TfcfAr9rayB2hNaXNQXIy7")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
