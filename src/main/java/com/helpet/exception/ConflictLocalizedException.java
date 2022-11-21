package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class ConflictLocalizedException extends LocalizedException {
    public ConflictLocalizedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public ConflictLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
