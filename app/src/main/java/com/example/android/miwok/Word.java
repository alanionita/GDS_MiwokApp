package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary item that stores an english word and a miwok translation
 */

public class Word {
    // default translation for the word
    private String mDefaultWord;

    // miwok translation for the word
    private String mMiwokWord;

    /**
     * Create a new word object
     * @param defaultTranslation is the word in a language familiar to the user eg: English
     * @param miwokTranslation is the miwok translation of the default word
     */

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultWord = defaultTranslation;
        mMiwokWord = miwokTranslation;
    }

    // define the getters for the variables housed in the class
    public String getDefaultWord () { return mDefaultWord; };
    public String getMiwokWord () { return mMiwokWord; };
}
