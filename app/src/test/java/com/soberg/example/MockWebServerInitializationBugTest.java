package com.soberg.example;

import org.junit.Test;

import okhttp3.mockwebserver.MockWebServer;

public class MockWebServerInitializationBugTest {

    @Test
    public void mockWebServerTest() {
        // Initializing the MockWebServer here will fail.
        MockWebServer server = new MockWebServer();
    }
}
