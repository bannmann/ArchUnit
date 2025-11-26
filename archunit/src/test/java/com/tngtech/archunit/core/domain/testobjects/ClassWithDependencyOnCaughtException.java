package com.tngtech.archunit.core.domain.testobjects;

import java.io.IOException;

@SuppressWarnings("unused")
public class ClassWithDependencyOnCaughtException {
    static {
        try {
            throw new IOException();
        } catch (IOException e) {
        }
    }

    ClassWithDependencyOnCaughtException() {
        try {
            throw new IOException();
        } catch (IOException e) {
        }
    }

    void simpleCatchMethod() {
        try {
            throw new IOException();
        } catch (IOException e) {
        }
    }

    public static void throwingMethod() throws IOException {
        throw new IOException();
    }

    void complexCatchMethod() {
        try {
            throw new IOException();
        } catch (IllegalStateException | IOException e) {
        }
    }
}
