package com.tngtech.archunit.core.domain.testobjects;

import java.io.IOException;

@SuppressWarnings("unused")
public class ClassWithDependencyOnTryCatchBlock {
    static {
        try {
            throw new IOException();
        } catch (IOException e) {
        }
    }

    ClassWithDependencyOnTryCatchBlock()
    {
        try {
            throw new IOException();
        } catch (IOException e) {
        }
    }

    void method() {
        try {
            throw new IOException();
        } catch (IOException e) {
        }
    }

    public static void throwingMethod() throws IOException {
        throw new IOException();
    }
}
