package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class ConflictLocalizedException extends LocalizedException {
    public ConflictLocalizedException(LocalizedError localizedError, String debugMessage) {
        super(localizedError, debugMessage);
    }

    public ConflictLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
