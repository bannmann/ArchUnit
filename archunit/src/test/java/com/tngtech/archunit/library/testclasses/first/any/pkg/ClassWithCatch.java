package com.tngtech.archunit.library.testclasses.first.any.pkg;

import com.tngtech.archunit.library.testclasses.some.pkg.SomePkgException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassWithCatch {
    private static final Logger log = LoggerFactory.getLogger(ClassWithCatch.class);

    void method1() {
        try {
            log.debug("method1");
        } catch (SomePkgException e) {
            log.warn("Exception occurred", e);
        }
    }

    void method2() {
        try {
            log.debug("method2");
        } catch (SomePkgException e) {
            log.warn("Exception occurred with baz={}", e.getBaz(), e);
        }
    }
}
