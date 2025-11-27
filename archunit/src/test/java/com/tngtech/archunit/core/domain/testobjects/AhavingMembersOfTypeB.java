package com.tngtech.archunit.core.domain.testobjects;

@DomainAnnotation
@SuppressWarnings("unused")
public class AhavingMembersOfTypeB {
    private B b;
    private boolean staticInitializerInstanceofCheck = new Object() instanceof B;

    public AhavingMembersOfTypeB(B b) {
        this.b = b;
    }

    B methodReturningB() {
        return null;
    }

    void methodWithParameterTypeB(String some, B b) {
    }

    void checkingInstanceOfB() {
        boolean check = new Object() instanceof B;
    }
}
