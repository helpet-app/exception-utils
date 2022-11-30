package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class ForbiddenLocalizedException extends LocalizedException {
    public ForbiddenLocalizedException(LocalizedError localizedError, String debugMessage) {
        super(localizedError, debugMessage);
    }

    public ForbiddenLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
