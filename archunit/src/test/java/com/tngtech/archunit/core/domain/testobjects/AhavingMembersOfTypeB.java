package com.tngtech.archunit.core.domain.testobjects;

@DomainAnnotation
@SuppressWarnings({"RedundantThrows", "unused"})
public class AhavingMembersOfTypeB {
    static {
        try {
            throw new B.BException();
        } catch (B.BException e) {
        }
    }
    private B b;
    private boolean staticInitializerInstanceofCheck = new Object() instanceof B;

    public AhavingMembersOfTypeB(B b) throws B.BException {
        this.b = b;

        try {
            throw new B.BException();
        } catch (B.BException e) {
        }
    }

    B methodReturningB() {
        return null;
    }

    void methodWithParameterTypeB(String some, B b) {
    }

    void throwingBException() throws B.BException {

    }

    void checkingInstanceOfB() {
        boolean check = new Object() instanceof B;
    }

    void catchingBException() {
        try {
            throw new B.BException();
        } catch (B.BException e) {
        }
    }
}
