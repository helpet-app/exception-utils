package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class UnauthorizedLocalizedException extends LocalizedException {
    public UnauthorizedLocalizedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public UnauthorizedLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
