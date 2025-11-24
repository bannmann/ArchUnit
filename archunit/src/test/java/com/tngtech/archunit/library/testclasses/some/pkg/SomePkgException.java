package com.tngtech.archunit.library.testclasses.some.pkg;

public class SomePkgException extends RuntimeException {
    private final int baz;

    public SomePkgException(int baz) {
        this.baz = baz;
    }

    public int getBaz() {
        return baz;
    }
}
