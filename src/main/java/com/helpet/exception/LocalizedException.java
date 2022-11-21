package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;
import lombok.Getter;

@Getter
public abstract class LocalizedException extends RuntimeException {
    protected final String code;

    protected final String exceptionKey;

    protected final String reasonKey;

    protected LocalizedException(String code, String exceptionKey, String reasonKey) {
        this.code = code;
        this.exceptionKey = String.join(".", "exceptions", exceptionKey, "title");
        this.reasonKey = String.join(".", "exceptions", exceptionKey, "reasons", reasonKey);
    }

    protected LocalizedException(LocalizedError localizedError) {
        this(localizedError.getCode(), localizedError.getExceptionKey(), localizedError.getReasonKey());
    }
}
