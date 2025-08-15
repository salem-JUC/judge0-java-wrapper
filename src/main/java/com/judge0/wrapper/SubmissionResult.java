package com.judge0.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubmissionResult {
    @JsonProperty("source_code")
    private String sourceCode;

    @JsonProperty("language_id")
    private int languageId;

    @JsonProperty("stdin")
    private String stdin;

    @JsonProperty("expected_output")
    private String expectedOutput;

    @JsonProperty("stdout")
    private String stdout;

    @JsonProperty("status_id")
    private int statusId;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("finished_at")
    private String finishedAt;
    @JsonProperty("time")
    private String time;
    @JsonProperty("memory")
    private String memory;
    @JsonProperty("stderr")
    private String stderr;
    @JsonProperty("token")
    private String token;

    @JsonProperty("number_of_runs")
    private int numberOfRuns;

    @JsonProperty("cpu_time_limit")
    private String cpuTimeLimit;

    @JsonProperty("cpu_extra_time")
    private String cpuExtraTime;

    @JsonProperty("wall_time_limit")
    private String wallTimeLimit;

    @JsonProperty("memory_limit")
    private int memoryLimit;

    @JsonProperty("stack_limit")
    private int stackLimit;

    @JsonProperty("max_processes_and_or_threads")
    private int maxProcessesAndOrThreads;

    @JsonProperty("enable_per_process_and_thread_time_limit")
    private boolean enablePerProcessAndThreadTimeLimit;

    @JsonProperty("enable_per_process_and_thread_memory_limit")
    private boolean enablePerProcessAndThreadMemoryLimit;

    @JsonProperty("max_file_size")
    private int maxFileSize;

    @JsonProperty("compile_output")
    private String compileOutput;

    @JsonProperty("exit_code")
    private Integer exitCode;

    @JsonProperty("exit_signal")
    private Integer exitSignal;
    @JsonProperty("message")
    private String message;

    @JsonProperty("wall_time")
    private String wallTime;

    @JsonProperty("compiler_options")
    private String compilerOptions;

    @JsonProperty("command_line_arguments")
    private String commandLineArguments;

    @JsonProperty("redirect_stderr_to_stdout")
    private boolean redirectStderrToStdout;

    @JsonProperty("callback_url")
    private String callbackUrl;

    @JsonProperty("additional_files")
    private String additionalFiles;

    @JsonProperty("enable_network")
    private boolean enableNetwork;

    @JsonProperty("post_execution_filesystem")
    private String postExecutionFilesystem;

    @JsonProperty("status")
    private Status status;
    @JsonProperty("language")
    private Language language;

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getStdin() {
        return stdin;
    }

    public void setStdin(String stdin) {
        this.stdin = stdin;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(String expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public String getStdout() {
        return stdout;
    }

    public void setStdout(String stdout) {
        this.stdout = stdout;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStderr() {
        return stderr;
    }

    public void setStderr(String stderr) {
        this.stderr = stderr;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getNumberOfRuns() {
        return numberOfRuns;
    }

    public void setNumberOfRuns(int numberOfRuns) {
        this.numberOfRuns = numberOfRuns;
    }

    public String getCpuTimeLimit() {
        return cpuTimeLimit;
    }

    public void setCpuTimeLimit(String cpuTimeLimit) {
        this.cpuTimeLimit = cpuTimeLimit;
    }

    public String getCpuExtraTime() {
        return cpuExtraTime;
    }

    public void setCpuExtraTime(String cpuExtraTime) {
        this.cpuExtraTime = cpuExtraTime;
    }

    public String getWallTimeLimit() {
        return wallTimeLimit;
    }

    public void setWallTimeLimit(String wallTimeLimit) {
        this.wallTimeLimit = wallTimeLimit;
    }

    public int getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(int memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public int getStackLimit() {
        return stackLimit;
    }

    public void setStackLimit(int stackLimit) {
        this.stackLimit = stackLimit;
    }

    public int getMaxProcessesAndOrThreads() {
        return maxProcessesAndOrThreads;
    }

    public void setMaxProcessesAndOrThreads(int maxProcessesAndOrThreads) {
        this.maxProcessesAndOrThreads = maxProcessesAndOrThreads;
    }

    public boolean isEnablePerProcessAndThreadTimeLimit() {
        return enablePerProcessAndThreadTimeLimit;
    }

    public void setEnablePerProcessAndThreadTimeLimit(boolean enablePerProcessAndThreadTimeLimit) {
        this.enablePerProcessAndThreadTimeLimit = enablePerProcessAndThreadTimeLimit;
    }

    public boolean isEnablePerProcessAndThreadMemoryLimit() {
        return enablePerProcessAndThreadMemoryLimit;
    }

    public void setEnablePerProcessAndThreadMemoryLimit(boolean enablePerProcessAndThreadMemoryLimit) {
        this.enablePerProcessAndThreadMemoryLimit = enablePerProcessAndThreadMemoryLimit;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getCompileOutput() {
        return compileOutput;
    }

    public void setCompileOutput(String compileOutput) {
        this.compileOutput = compileOutput;
    }

    public Integer getExitCode() {
        return exitCode;
    }

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    public Integer getExitSignal() {
        return exitSignal;
    }

    public void setExitSignal(Integer exitSignal) {
        this.exitSignal = exitSignal;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getWallTime() {
        return wallTime;
    }

    public void setWallTime(String wallTime) {
        this.wallTime = wallTime;
    }

    public String getCompilerOptions() {
        return compilerOptions;
    }

    public void setCompilerOptions(String compilerOptions) {
        this.compilerOptions = compilerOptions;
    }

    public String getCommandLineArguments() {
        return commandLineArguments;
    }

    public void setCommandLineArguments(String commandLineArguments) {
        this.commandLineArguments = commandLineArguments;
    }

    public boolean isRedirectStderrToStdout() {
        return redirectStderrToStdout;
    }

    public void setRedirectStderrToStdout(boolean redirectStderrToStdout) {
        this.redirectStderrToStdout = redirectStderrToStdout;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getAdditionalFiles() {
        return additionalFiles;
    }

    public void setAdditionalFiles(String additionalFiles) {
        this.additionalFiles = additionalFiles;
    }

    public boolean isEnableNetwork() {
        return enableNetwork;
    }

    public void setEnableNetwork(boolean enableNetwork) {
        this.enableNetwork = enableNetwork;
    }

    public String getPostExecutionFilesystem() {
        return postExecutionFilesystem;
    }

    public void setPostExecutionFilesystem(String postExecutionFilesystem) {
        this.postExecutionFilesystem = postExecutionFilesystem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "SubmissionResult{" +
                "sourceCode='" + sourceCode + '\'' +
                ", languageId=" + languageId +
                ", stdin='" + stdin + '\'' +
                ", expectedOutput='" + expectedOutput + '\'' +
                ", stdout='" + stdout + '\'' +
                ", statusId=" + statusId +
                ", createdAt=" + createdAt +
                ", finishedAt=" + finishedAt +
                ", time='" + time + '\'' +
                ", memory='" + memory + '\'' +
                ", stderr='" + stderr + '\'' +
                ", token='" + token + '\'' +
                ", numberOfRuns=" + numberOfRuns +
                ", cpuTimeLimit='" + cpuTimeLimit + '\'' +
                ", cpuExtraTime='" + cpuExtraTime + '\'' +
                ", wallTimeLimit='" + wallTimeLimit + '\'' +
                ", memoryLimit=" + memoryLimit +
                ", stackLimit=" + stackLimit +
                ", maxProcessesAndOrThreads=" + maxProcessesAndOrThreads +
                ", enablePerProcessAndThreadTimeLimit=" + enablePerProcessAndThreadTimeLimit +
                ", enablePerProcessAndThreadMemoryLimit=" + enablePerProcessAndThreadMemoryLimit +
                ", maxFileSize=" + maxFileSize +
                ", compileOutput='" + compileOutput + '\'' +
                ", exitCode=" + exitCode +
                ", exitSignal=" + exitSignal +
                ", message='" + message + '\'' +
                ", wallTime='" + wallTime + '\'' +
                ", compilerOptions='" + compilerOptions + '\'' +
                ", commandLineArguments='" + commandLineArguments + '\'' +
                ", redirectStderrToStdout=" + redirectStderrToStdout +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", additionalFiles='" + additionalFiles + '\'' +
                ", enableNetwork=" + enableNetwork +
                ", postExecutionFilesystem='" + postExecutionFilesystem + '\'' +
                ", status=" + status.toString() +
                ", language=" + language.toString() +
                '}';
    }
}
