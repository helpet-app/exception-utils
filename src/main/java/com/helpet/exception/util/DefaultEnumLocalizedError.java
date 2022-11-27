package com.helpet.exception.util;

public interface DefaultEnumLocalizedError extends LocalizedError {
    String name();

    default String getCode() {
        return this.name();
    }

    default String getTitleKey() {
        return this.getClass()
                   .getSimpleName()
                   .replace("LocalizedError", "")
                   .replaceAll("([a-z0-9])([A-Z])", "$1-$2")
                   .toLowerCase();
    }

    default String getReasonKey() {
        return this.name().toLowerCase().replace("_", "-");
    }
}
