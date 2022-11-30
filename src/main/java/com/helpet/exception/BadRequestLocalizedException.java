package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class BadRequestLocalizedException extends LocalizedException {
    public BadRequestLocalizedException(LocalizedError localizedError, String debugMessage) {
        super(localizedError, debugMessage);
    }

    public BadRequestLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
