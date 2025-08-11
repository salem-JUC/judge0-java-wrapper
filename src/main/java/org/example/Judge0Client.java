package org.example;

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

    public void submit(String sourceCode, int languageId, String input, String expected_output) throws IOException, InterruptedException {
        String sourceCodeEncoded = Base64.getEncoder().encodeToString(sourceCode.getBytes());
        String inputEncoded = Base64.getEncoder().encodeToString(input.getBytes());
        String expectedOutputEncoded = Base64.getEncoder().encodeToString(expected_output.getBytes());
        String jsonPayload = "{\n" +
                "  \"source_code\": \"" + sourceCodeEncoded + "\",\n" +
                "  \"language_id\": " + languageId + ",\n" +
                "  \"stdin\": \"" + inputEncoded + "\",\n" +
                "  \"expected_output\": \"" + expectedOutputEncoded + "\"\n" +
                "}";


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl+"/submissions?base64_encoded=true&wait=true&fields=*"))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", rapidapiHost)
                .header("Content-Type", "application/json")
                .method("POST", HttpRequest.BodyPublishers.ofString(jsonPayload)
                )
                .build();


        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println("Response :-" + response.toString());
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
