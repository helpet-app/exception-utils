package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class ForbiddenLocalizedDetailedException extends LocalizedDetailedException {
    public ForbiddenLocalizedDetailedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public ForbiddenLocalizedDetailedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
