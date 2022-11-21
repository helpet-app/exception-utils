package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class ConflictLocalizedDetailedException extends LocalizedDetailedException {
    public ConflictLocalizedDetailedException(String code, String exceptionKey, String reasonKey) {
        super(code, exceptionKey, reasonKey);
    }

    public ConflictLocalizedDetailedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
