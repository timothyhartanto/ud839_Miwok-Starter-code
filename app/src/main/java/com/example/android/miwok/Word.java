package com.example.android.miwok;

/**
 * Created by Proto on 3/28/2017.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != -1;
    }
}
