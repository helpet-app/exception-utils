package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class BadRequestLocalizedDetailedException extends LocalizedDetailedException {
    public BadRequestLocalizedDetailedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public BadRequestLocalizedDetailedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
