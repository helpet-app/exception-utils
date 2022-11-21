package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class UnauthorizedLocalizedDetailedException extends LocalizedDetailedException {
    public UnauthorizedLocalizedDetailedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public UnauthorizedLocalizedDetailedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
