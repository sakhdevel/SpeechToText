package com.example.texttospeech.lib.Model;

public class Translation {

    private String phrase;
    private String description;
    private String phraseLanguageCode;

    public Translation(String phrase, String description, String phraseLanguageCode) {
        this.phrase = phrase;
        this.description = description;
        this.phraseLanguageCode = phraseLanguageCode;
    }

    public String getPhrase() {
        return phrase;
    }

    public String getDescription() {
        return description;
    }

    public String getPhraseLanguageCode() {
        return phraseLanguageCode;
    }
}
