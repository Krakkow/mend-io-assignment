package com.mendio.githubtests.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.mendio.githubtests.utils.RestUtils;
import static org.testng.Assert.assertTrue;

public class GitHubApiSearchTest {

    private CompletableFuture<Void> searchAndPrintCount(String keyword) {
        return CompletableFuture.runAsync(() -> {
            try {
                String url = "https://api.github.com/search/repositories?q=" + keyword;
                String response = RestUtils.get(url);
                JSONObject json = new JSONObject(response);
                int totalCount = json.getInt("total_count");
                System.out.printf("Query: %-12s → Found %,d repositories%n", keyword, totalCount);
                assertTrue(totalCount > 0, "No repositories found for keyword: " + keyword);
            } catch (Exception e) {
                System.err.printf("Query: %-12s → Error: %s%n", keyword, e.getMessage());
            }
        });
    }
@Test
    public void runConcurrentSearchesUsingApi() {
        List<String> queries = List.of("selenium","junit","playwright","testng","restassured");
        System.out.println("Searching GitHub for repositories concurrently...");

        CompletableFuture<?>[] tasks = queries.stream().map(this::searchAndPrintCount).toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(tasks).join();
        System.out.println("All searches completed.");
    }
    
}
