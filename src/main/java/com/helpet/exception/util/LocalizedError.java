package com.helpet.exception.util;

public interface LocalizedError {
    String getCode();

    String getTitleKey();

    String getReasonKey();
}
