package com.example.android.miwok;

/**
 * Created by caine on 11/9/16.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}