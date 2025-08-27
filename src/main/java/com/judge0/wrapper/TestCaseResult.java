package com.judge0.wrapper;

public class TestCaseResult {

    String input;
    String expectedOutput;
    String actualOutput;
    boolean passed;
    String compilerOutput;

    public TestCaseResult(String input, String expectedOutput, String actualOutput, boolean passed, String compilerOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
        this.actualOutput = actualOutput;
        this.passed = passed;
        this.compilerOutput = compilerOutput;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public String getActualOutput() {
        return actualOutput;
    }

    public void setActualOutput(String actualOutput) {
        this.actualOutput = actualOutput;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public String getCompilerOutput() {
        return compilerOutput;
    }

    public void setCompilerOutput(String compilerOutput) {
        this.compilerOutput = compilerOutput;
    }


    @Override
    public String toString() {
        return "TestCaseResult{" +
                "input='" + input + '\'' +
                ", expectedOutput='" + expectedOutput + '\'' +
                ", actualOutput='" + actualOutput + '\'' +
                ", passed=" + passed +
                ", compilerOutput='" + compilerOutput + '\'' +
                '}';
    }
}
