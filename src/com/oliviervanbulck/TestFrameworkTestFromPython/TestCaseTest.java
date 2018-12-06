package com.oliviervanbulck.TestFrameworkTestFromPython;

public class TestCaseTest extends TestCase {
    TestResult result = new TestResult();

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assert("setUp testMethod tearDown ".equals(test.log));
    }

    public void testResult() {
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assert("1 run, 0 failed".equals(result.summary()));
    }

    public void testFailedResult() {
        WasRun test = new WasRun("testBrokenMethod");
        test.run(result);
        assert("1 run, 1 failed".equals(result.summary()));
    }

    public void testFailedResultFormatting() {
        result.testStarted();
        result.testFailed();
        assert("1 run, 1 failed".equals(result.summary()));
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        assert("2 run, 1 failed".equals(result.summary()));
    }
}
