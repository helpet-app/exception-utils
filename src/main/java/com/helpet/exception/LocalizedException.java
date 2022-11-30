package com.helpet.exception;

import com.helpet.exception.util.LocalizedError;
import lombok.Getter;

@Getter
public abstract class LocalizedException extends RuntimeException {
    protected final String code;

    protected final String messageKey;

    protected LocalizedException(LocalizedError localizedError, String debugMessage) {
        super(debugMessage);
        this.code = localizedError.getCode();
        this.messageKey = buildMessageKey(localizedError.getErrorKeyPrefix(), localizedError.getErrorKey());
    }

    protected LocalizedException(LocalizedError localizedError) {
        this.code = localizedError.getCode();
        this.messageKey = buildMessageKey(localizedError.getErrorKeyPrefix(), localizedError.getErrorKey());
    }

    private String buildMessageKey(String errorPrefixKey, String errorKey) {
        return errorPrefixKey + "." + errorKey;
    }
}
