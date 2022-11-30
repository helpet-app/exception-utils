package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class UnauthorizedLocalizedException extends LocalizedException {
    public UnauthorizedLocalizedException(LocalizedError localizedError, String debugMessage) {
        super(localizedError, debugMessage);
    }

    public UnauthorizedLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
