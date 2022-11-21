package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class BadRequestLocalizedException extends LocalizedException {
    public BadRequestLocalizedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public BadRequestLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
