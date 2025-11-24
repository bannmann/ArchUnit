package com.tngtech.archunit.core.domain.testobjects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@SuppressWarnings("unused")
public class ClassWithDependencyOnTryCatchBlock {
    private static final Logger log = LoggerFactory.getLogger(ClassWithDependencyOnTryCatchBlock.class);

    void method() {
        try {
            throw new IOException();
        } catch (IOException e) {
            log.warn("IO Exception", e);
        }
    }

    public static void throwingMethod() throws IOException {
        throw new IOException();
    }
}
