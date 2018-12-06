package com.oliviervanbulck.TestFrameworkTestFromPython;

public class WasRun extends TestCase {
    private boolean wasRun = false;
    private boolean wasSetUp = false;
    String log = "";

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        this.wasRun = true;
        this.log += "testMethod ";
    }

    public void testBrokenMethod() throws Exception {
        throw new Exception();
    }

    public void setUp() {
        this.wasRun = false;
        this.wasSetUp = true;
        this.log = "setUp ";
    }

    public void tearDown() {
        this.log += "tearDown ";
    }
}
