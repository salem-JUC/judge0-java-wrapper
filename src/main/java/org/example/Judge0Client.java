package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.example.Exception.InvalidClientConfigurationException;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.Base64;

public class Judge0Client {

    private String baseUrl;
    private String apiKey;
    private String rapidapiHost;
    public Judge0Client(Builder builder) {
        baseUrl = builder.baseUrl;
        if (builder.apiKey != null)
            apiKey = builder.apiKey;
        if (builder.rapidapiHost != null)
            rapidapiHost = builder.rapidapiHost;
    }

    ObjectMapper mapper = new ObjectMapper();

    public SubmissionResult submitAndGetResult(Submission submission) throws IOException, InterruptedException {


        ObjectNode payload = mapper.createObjectNode();

        payload.put("source_code", submission.getSourceCode());
        payload.put("language_id", submission.getLanguageId());
        if (submission.getStdin() != null) {
            payload.put("stdin", submission.getStdin());
        }
        if (submission.getExpectedOutput() != null) {
            payload.put("expected_output", submission.getExpectedOutput());
        }
        if (submission.getCommandLineArguments() != null){
            payload.put("command_line_arguments", submission.getCommandLineArguments());
        }

        System.out.println("Payload String:- " + payload.toString());
        System.out.println("Payload text :-" + payload.asText());
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl+"/submissions?base64_encoded=true&wait=true&fields=*"))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", rapidapiHost)
                .header("Content-Type", "application/json")
                .method("POST", HttpRequest.BodyPublishers.ofString(payload.toString())
                )
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 403){
            throw new InvalidClientConfigurationException("Invalid API Key or RapidAPI Host");
        }
        if (response.statusCode() != 201) {
            throw new RuntimeException("Failed to submit code: " + response.body());
        }
        SubmissionResult submissionResult = mapper.readValue(response.body() , SubmissionResult.class);
        submissionResult = decodeSubmissionResult(submissionResult);
        return submissionResult;
    }

    // this method do the same of the submitAndGetResult method but return a token instead of the full result
    public String submitAndGetToken(Submission submission) throws IOException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode payload = mapper.createObjectNode();

        payload.put("source_code", submission.getSourceCode());
        payload.put("language_id", submission.getLanguageId());
        if (submission.getStdin() != null) {
            payload.put("stdin", submission.getStdin());
        }
        if (submission.getExpectedOutput() != null) {
            payload.put("expected_output", submission.getExpectedOutput());
        }
        if (submission.getCommandLineArguments() != null){
            payload.put("command_line_arguments", submission.getCommandLineArguments());
        }

        System.out.println("Payload String:- " + payload.toString());
        System.out.println("Payload text :-" + payload.asText());
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl+"/submissions?base64_encoded=true&wait=false&fields=*"))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", rapidapiHost)
                .header("Content-Type", "application/json")
                .method("POST", HttpRequest.BodyPublishers.ofString(payload.toString())
                )
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 403){
            throw new InvalidClientConfigurationException("Invalid API Key or RapidAPI Host");
        }
        if (response.statusCode() != 201) {
            throw new RuntimeException("Failed to submit code: " + response.body());
        }
        JsonNode rooNode = mapper.readTree(response.body());
        String token = rooNode.path("token").asText();
        return token;
    }

    public SubmissionResult getSubmission(String token) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl+"/submissions/"+token+"?base64_encoded=true&fields=*"))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", rapidapiHost)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 403){
            throw new InvalidClientConfigurationException("Invalid API Key or RapidAPI Host");
        }
        if (response.statusCode() == 404){
            throw new RuntimeException("Submission not found for token: " + token);
        }
        SubmissionResult submissionResult = mapper.readValue(response.body() , SubmissionResult.class);
        submissionResult = decodeSubmissionResult(submissionResult);

        return submissionResult;
    }

    



    public void printLanguages() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl+"/languages"))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", rapidapiHost)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    // helper method to decode source code , stdin , stdout, expected_output , post_execution_filesystem
    private SubmissionResult decodeSubmissionResult(SubmissionResult submissionResult) {
        if (submissionResult.getSourceCode() != null) {
            submissionResult.setSourceCode(new String(Base64.getDecoder().decode(submissionResult.getSourceCode())));
        }
        if (submissionResult.getStdin() != null) {
            submissionResult.setStdin(new String(Base64.getDecoder().decode(submissionResult.getStdin())));
        }
        if (submissionResult.getStdout() != null) {
            submissionResult.setStdout(new String(Base64.getDecoder().decode(submissionResult.getStdout())));
        }
        if (submissionResult.getExpectedOutput() != null) {
            submissionResult.setExpectedOutput(new String(Base64.getDecoder().decode(submissionResult.getExpectedOutput())));
        }
        if (submissionResult.getPostExecutionFilesystem() != null) {
            submissionResult.setPostExecutionFilesystem(new String(Base64.getDecoder().decode(submissionResult.getPostExecutionFilesystem())));
        }
        return submissionResult;
    }



    public static class Builder {
        private String baseUrl;
        private String apiKey;
        private String rapidapiHost;

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public Builder setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public Builder setRapidapiHost(String rapidapiHost) {
            this.rapidapiHost = rapidapiHost;
            return this;
        }
        public Judge0Client build() {
            if (baseUrl == null || baseUrl.equals("")) {
                throw new InvalidClientConfigurationException("Base URL must be set");
            }

            return new Judge0Client(this);
        }
    }
}
