package com.example.texttospeech.lib;

public enum EngineState {
    NOT_INITIALIZED,
    READY_TO_START_TRAINING,
    TRAINING_IN_PROGRESS,
    READING_TASK,
    WAITING_FOR_USER_INPUT,
    SKIPPING,
    FORGETTING,
    PROCESSING_SUCCESS,
    PROCESSING_MISTAKE,
}
