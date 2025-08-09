package org.example;

import org.example.consumer.Judge0Client;

public class SubmissionBuilder {

    private String sourceCode;
    private int languageId;
    private String input;
    private String expectedOutput;


    public SubmissionBuilder setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    public SubmissionBuilder setLanguageId(int languageId) {
        this.languageId = languageId;
        return this;
    }

    public SubmissionBuilder setInput(String input) {
        this.input = input;
        return this;
    }

    public SubmissionBuilder setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
        return this;
    }

    public Submission build() {
        return new Submission(sourceCode, languageId, input, expectedOutput);
    }
}
