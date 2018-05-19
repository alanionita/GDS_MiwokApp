package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary item that stores an english word and a miwok translation
 */

public class Word {
    // default translation for the word
    private String defaultWord;

    // miwok translation for the word
    private String miwokWord;

    // resource ID
    private int imageResourceID = NO_IMAGE_PROVIDED;

    // noimage provided
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new word object - primary constructor
     * @param defaultTranslation is the word in a language familiar to the user eg: English
     * @param miwokTranslation is the miwok translation of the default word
     */

    public Word(String defaultTranslation, String miwokTranslation) {
        defaultWord = defaultTranslation;
        miwokWord = miwokTranslation;
    }

    /**
     * Secondary contructor for word abject
     * @param defaultTranslation is the word in a language familiar to the user eg: English
     * @param miwokTranslation is the miwok translation of the default word
     * @param imageLocation is the image for each word item
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageLocation) {
        defaultWord = defaultTranslation;
        miwokWord = miwokTranslation;
        imageResourceID = imageLocation;
    }

    // define the getters for the variables housed in the class
    public String getDefaultWord () {
        return defaultWord;
    };
    public String getMiwokWord () {return miwokWord;};
    public int getImageResourceID () { return imageResourceID;};

    // returns whether or not the word has an image
    public boolean hasImage () {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }
}
