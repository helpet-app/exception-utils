package com.helpet.exception.util;

public interface LocalizedError {
    String getCode();

    default String getErrorKeyPrefix() {
        return "errors";
    }

    String getErrorKey();
}
