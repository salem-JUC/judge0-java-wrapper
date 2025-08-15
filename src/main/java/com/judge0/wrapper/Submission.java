package com.judge0.wrapper;

import com.judge0.wrapper.Exception.InvalidSubmissionBuild;

import java.util.Base64;

public class Submission {
    private String sourceCode;
    private int languageId;
    private String stdin;
    private String expectedOutput;
    private String commandLineArguments;

    public Submission(Builder builder) {
        this.sourceCode = builder.sourceCode;
        this.languageId = builder.languageId;

        if (builder.stdin != null)
            this.stdin = builder.stdin;
        if (builder.expectedOutput != null)
            this.expectedOutput = builder.expectedOutput;
        if (builder.commandLineArguments != null)
            this.commandLineArguments = builder.commandLineArguments;

    }

    public String getSourceCode() {
        return sourceCode;
    }

    public int getLanguageId() {
        return languageId;
    }

    public String getStdin() {
        return stdin;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public String getCommandLineArguments() {
        return commandLineArguments;
    }

    public void setCommandLineArguments(String commandLineArguments) {
        this.commandLineArguments = commandLineArguments;
    }

    public static class Builder {
        private String sourceCode;
        private int languageId;
        private String stdin;
        private String expectedOutput;
        private String commandLineArguments;

        public Builder setSourceCode(String sourceCode) {
            this.sourceCode = Base64.getEncoder().encodeToString(sourceCode.getBytes());
            return this;
        }
        public Builder setLanguageId(int languageId) {
            this.languageId = languageId;
            return this;
        }
        public Builder setStdin(String stdin) {
            this.stdin = Base64.getEncoder().encodeToString(stdin.getBytes());
            return this;
        }
        public Builder setExpectedOutput(String expectedOutput) {
            this.expectedOutput = Base64.getEncoder().encodeToString(expectedOutput.getBytes());
            return this;
        }
        public Builder setCommandLineArguments(String commandLineArguments) {
            this.commandLineArguments = commandLineArguments;
            return this;
        }

        public Submission build() {
            if (sourceCode == null || sourceCode.isEmpty()) {
                throw new InvalidSubmissionBuild("Source code must not be null or empty");
            }
            if (languageId <= 0) {
                throw new InvalidSubmissionBuild("Language ID must be a positive integer");
            }
            return new Submission(this);
        }

    }
}
