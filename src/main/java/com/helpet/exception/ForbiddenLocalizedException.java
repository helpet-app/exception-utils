package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class ForbiddenLocalizedException extends LocalizedException {
    public ForbiddenLocalizedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public ForbiddenLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
