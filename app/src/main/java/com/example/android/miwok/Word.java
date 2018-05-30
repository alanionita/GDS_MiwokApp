package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary item that stores an english word and a miwok translation
 */

class Word {
    // noimage provided
    private static final int NO_IMAGE_PROVIDED = -1;
    // default translation for the word
    private String defaultWord;
    // miwok translation for the word
    private String miwokWord;
    // resource ID
    private int imageResourceID = NO_IMAGE_PROVIDED;
    // audio file
    private int audioFile;

    /**
     * Create a new word object - primary constructor
     * @param defaultTranslation is the word in a language familiar to the user eg: English
     * @param miwokTranslation is the miwok translation of the default word
     * @param audioLocation is the audio file link for each word item
     */

    Word(String defaultTranslation, String miwokTranslation, int audioLocation) {
        defaultWord = defaultTranslation;
        miwokWord = miwokTranslation;
        audioFile = audioLocation;
    }

    /**
     * Secondary contructor for word abject
     * @param defaultTranslation is the word in a language familiar to the user eg: English
     * @param miwokTranslation is the miwok translation of the default word
     * @param imageLocation is the image for each word item
     * @param audioLocation is the audio file link for each word item
     */
    Word(String defaultTranslation, String miwokTranslation, int imageLocation, int audioLocation) {
        defaultWord = defaultTranslation;
        miwokWord = miwokTranslation;
        imageResourceID = imageLocation;
        audioFile = audioLocation;
    }

    // define the getters for the variables housed in the class
    String getDefaultWord() {
        return defaultWord;
    }

    String getMiwokWord() {
        return miwokWord;
    }

    int getImageResourceID() {
        return imageResourceID;
    }

    int getAudioResourceID() {
        return audioFile;
    }

    // returns whether or not the word has an image
    boolean hasImage() {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }
}
