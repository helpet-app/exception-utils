package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class NotFoundLocalizedException extends LocalizedException {
    public NotFoundLocalizedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public NotFoundLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
