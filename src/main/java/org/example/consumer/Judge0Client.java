package org.example.consumer;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.Base64;

public class Judge0Client {

    public Judge0Client() {
        // Constructor
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
                .uri(URI.create("https://judge0-extra-ce.p.rapidapi.com/submissions?base64_encoded=true&wait=true&fields=*"))
                .header("x-rapidapi-key", "64431d57cbmsh5e695d9da960983p1ca418jsn067194f9b2fa")
                .header("x-rapidapi-host", "judge0-ce.p.rapidapi.com")
                .header("Content-Type", "application/json")
                .method("POST", HttpRequest.BodyPublishers.ofString(jsonPayload)
                )
                .build();


        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println("Response :-" + response.toString());
    }
}
