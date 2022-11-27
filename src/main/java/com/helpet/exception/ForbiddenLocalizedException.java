package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class ForbiddenLocalizedException extends LocalizedException {
    public ForbiddenLocalizedException(String code, String titleKey, String reasonKey) {
        super(code, titleKey, reasonKey);
    }

    public ForbiddenLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
