package com.example.texttospeech.lib;

public enum Answer {
    // User guessed the phrase
    CORRECT,

    // User didn't guess the phrase
    WRONG,

    // User wants to skip the phrase. The phrase will be suggested later again.
    SKIP,

    // User wants to forget the phrase. The phrase will never be suggested again.
    FORGET
}
