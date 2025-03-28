package com.mendio.githubtests.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.json.JSONObject;

import com.mendio.githubtests.utils.RestUtils;

public class GitHubApiSearchChecker {

    public static CompletableFuture<Void> searchAndPrintCount(String keyword) {
        return CompletableFuture.runAsync(() -> {
            try {
                String url = "https://api.github.com/search/repositories?q=" + keyword;
                String response = RestUtils.get(url);
                JSONObject json = new JSONObject(response);
                int totalCount = json.getInt("total_count");
                System.out.printf("Query: %-12s → Found %,d repositories%n", keyword, totalCount);
            } catch (Exception e) {
                System.err.printf("Query: %-12s → Error: %s%n", keyword, e.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        List<String> queries = List.of("selenium","junit","playwright","testng","restassured");
        System.out.println("Searching GitHub for repositories concurrently...");

        CompletableFuture<?>[] tasks = queries.stream().map(GitHubApiSearchChecker::searchAndPrintCount).toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(tasks).join();
        System.out.println("All searches completed.");
    }
    
}
