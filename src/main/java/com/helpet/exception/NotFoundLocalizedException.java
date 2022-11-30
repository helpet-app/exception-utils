package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class NotFoundLocalizedException extends LocalizedException {
    public NotFoundLocalizedException(LocalizedError localizedError, String debugMessage) {
        super(localizedError, debugMessage);
    }

    public NotFoundLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
