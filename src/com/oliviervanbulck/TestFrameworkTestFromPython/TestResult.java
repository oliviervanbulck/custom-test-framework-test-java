package com.oliviervanbulck.TestFrameworkTestFromPython;

class TestResult {
    private int runCount = 0;
    private int errorCount = 0;

    String summary() {
        return String.format("%d run, %d failed", runCount, errorCount);
    }

    void testStarted() {
        this.runCount++;
    }

    void testFailed() {
        this.errorCount++;
    }
}
