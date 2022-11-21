package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class NotFoundLocalizedDetailedException extends LocalizedDetailedException {
    public NotFoundLocalizedDetailedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public NotFoundLocalizedDetailedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
