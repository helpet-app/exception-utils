package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;
import lombok.Getter;

@Getter
public abstract class LocalizedException extends RuntimeException {
    protected final String code;

    protected final String titleKey;

    protected final String reasonKey;

    protected LocalizedException(String code, String titleKey, String reasonKey) {
        this.code = code;
        this.titleKey = String.join(".", "exceptions", "titles", titleKey);
        this.reasonKey = String.join(".", "exceptions", "reasons", reasonKey);
    }

    protected LocalizedException(LocalizedError localizedError) {
        this(localizedError.getCode(), localizedError.getTitleKey(), localizedError.getReasonKey());
    }
}
