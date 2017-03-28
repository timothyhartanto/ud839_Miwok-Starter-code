package com.example.android.miwok;

/**
 * Created by Proto on 3/28/2017.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = -1;

    private int mAudioResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int audioID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageID, int audioID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageID;
        mAudioResourceID = audioID;
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

    public int getAudioID(){
        return mAudioResourceID;
    }
}
