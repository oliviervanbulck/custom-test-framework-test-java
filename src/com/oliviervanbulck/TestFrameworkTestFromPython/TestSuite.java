package com.oliviervanbulck.TestFrameworkTestFromPython;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private List<TestCase> tests = new ArrayList<>();

    public TestResult run(TestResult result) {
        for(int i = 0; i < tests.size(); i++) {
            this.tests.get(i).run(result);
        }
        return result;
    }

    void add(TestCase test) {
        tests.add(test);
    }
}
