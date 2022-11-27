package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class BadRequestLocalizedException extends LocalizedException {
    public BadRequestLocalizedException(String code, String titleKey, String reasonKey) {
        super(code, titleKey, reasonKey);
    }

    public BadRequestLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
