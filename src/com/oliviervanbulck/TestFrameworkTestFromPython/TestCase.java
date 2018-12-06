package com.oliviervanbulck.TestFrameworkTestFromPython;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    private final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void setUp() {

    }

    public TestResult run(TestResult result) {
        result.testStarted();
        this.setUp();
        try {
            Method method = this.getClass().getMethod(this.name);
            method.invoke(this);
        } catch (Exception e) {
            //e.printStackTrace();
            result.testFailed();
        }
        this.tearDown();
        return result;
    }

    private void tearDown() {

    }
}
