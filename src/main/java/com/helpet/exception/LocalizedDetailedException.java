package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;
import lombok.Getter;

@Getter
public abstract class LocalizedDetailedException extends RuntimeException {
    protected final String code;

    protected final String exceptionKey;

    protected final String reasonKey;

    protected LocalizedDetailedException(String code, String exceptionKey, String reasonKey) {
        this.code = code;
        this.exceptionKey = String.join(".", "exceptions", exceptionKey, "title");
        this.reasonKey = String.join(".", "exceptions", exceptionKey, "reasons", reasonKey);
    }

    protected LocalizedDetailedException(LocalizedError localizedError) {
        this(localizedError.getCode(), localizedError.getExceptionKey(), localizedError.getReasonKey());
    }
}
