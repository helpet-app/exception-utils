package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;

public class NotFoundLocalizedException extends LocalizedException {
    public NotFoundLocalizedException(String code, String titleKey, String reasonKey) {
        super(code, titleKey, reasonKey);
    }

    public NotFoundLocalizedException(LocalizedError localizedError) {
        super(localizedError);
    }
}
