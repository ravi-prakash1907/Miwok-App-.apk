package com.example.android.miwok;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** pic icon */
    private int imageResorceId = HAS_NO_IMAGE;

    /** pic pronounciation */
    private int soundResorceId = HAS_NO_SOUND;

    /** Checking the presence of Image */
    private static final int HAS_NO_IMAGE = -1;

    /** Checking the presence of Sound */
    private static final int HAS_NO_SOUND = -1;

    public Word(String defaultTranslation, String miwokTranslation, int imgResorceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageResorceId = imgResorceId;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }



    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getIcon() {
        return imageResorceId;
    }

    public boolean hasImage(){
        return imageResorceId != HAS_NO_IMAGE;
    }


}