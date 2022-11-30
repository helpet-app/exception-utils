package com.helpet.exception.util;

public interface DefaultEnumLocalizedError extends LocalizedError {
    String name();

    default String getCode() {
        return this.name();
    }

    default String getErrorKey() {
        return this.name().toLowerCase().replace("_", "-");
    }
}
