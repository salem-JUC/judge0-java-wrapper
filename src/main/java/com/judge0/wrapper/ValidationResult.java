package com.judge0.wrapper;

import java.util.List;

public class ValidationResult {
    boolean allPassed;
    List<TestCaseResult> testCaseResults;

    public ValidationResult(boolean allPassed, List<TestCaseResult> testCaseResults) {
        this.allPassed = allPassed;
        this.testCaseResults = testCaseResults;
    }

    public boolean isAllPassed() {
        return allPassed;
    }

    public void setAllPassed(boolean allPassed) {
        this.allPassed = allPassed;
    }

    public List<TestCaseResult> getTestCaseResults() {
        return testCaseResults;
    }

    public void setTestCaseResults(List<TestCaseResult> testCaseResults) {
        this.testCaseResults = testCaseResults;
    }

    public List<TestCaseResult> getPassedTestCases(){
        return testCaseResults.stream().filter(TestCaseResult::isPassed).toList();
    }
    public List<TestCaseResult> getFailedTestCases(){
        return testCaseResults.stream().filter(tc -> !tc.isPassed()).toList();
    }

    public int getNumberOfTestCases(){
        return testCaseResults.size();
    }

    public int getNumberOfPassedTestCases(){
        return (int) testCaseResults.stream().filter(TestCaseResult::isPassed).count();
    }
    public int getNumberOfFailedTestCases(){
        return (int) testCaseResults.stream().filter(tc -> !tc.isPassed()).count();
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "allPassed=" + allPassed +
                ", testCaseResults=" + testCaseResults.toString() +
                '}';
    }
}
