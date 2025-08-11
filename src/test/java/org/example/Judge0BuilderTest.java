package org.example;

import org.example.Exception.InvalidClientConfigurationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Judge0BuilderTest {

    @Test
    void testBuilderWithAllFields() {
        Judge0Client client = new Judge0Client.Builder()
                .setBaseUrl("https://judge0-extra-ce.p.rapidapi.com")
                .setApiKey("testApiKey")
                .setRapidapiHost("judge0-extra-ce.p.rapidapi.com")
                .build();

        // We can't access private fields directly, so we use reflection
        assertEquals("https://judge0-extra-ce.p.rapidapi.com",
                getPrivateField(client, "baseUrl"));
        assertEquals("testApiKey", getPrivateField(client, "apiKey"));
        assertEquals("judge0-extra-ce.p.rapidapi.com", getPrivateField(client, "rapidapiHost"));
    }

    @Test
    void testBuilderWithoutOptionalFields() {
        Judge0Client client = new Judge0Client.Builder()
                .setBaseUrl("http://localhost:2358")
                .build();

        assertEquals("http://localhost:2358", getPrivateField(client, "baseUrl"));
        assertNull(getPrivateField(client, "apiKey"));
        assertNull(getPrivateField(client, "rapidapiHost"));
    }

    @Test
    void testBuilderMissingBaseUrlThrowsException() {
        InvalidClientConfigurationException exception = assertThrows(InvalidClientConfigurationException.class, () -> {
            new Judge0Client.Builder()
                    .setApiKey("testApiKey")
                    .setRapidapiHost("somehost")
                    .build();
        });

    }

    private Object getPrivateField(Object obj, String fieldName) {
        try {
            var field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            fail("Reflection error: " + e.getMessage());
            return null;
        }
    }

}