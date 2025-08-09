package org.example;

public class Submission {
    private String sourceCode;
    private int languageId;
    private String input;
    private String expectedOutput;

    public Submission(String sourceCode, int languageId, String input, String expectedOutput) {
        this.sourceCode = sourceCode;
        this.languageId = languageId;
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public int getLanguageId() {
        return languageId;
    }

    public String getInput() {
        return input;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }
}
