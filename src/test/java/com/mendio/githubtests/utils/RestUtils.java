package com.mendio.githubtests.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestUtils {

    private static final HttpClient client = HttpClient.newHttpClient();

    public static String get(String url) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Accept", "application/vnd.github+json").build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("HTTP GET request faild for: " + url, e);
        }
    }
    
}
