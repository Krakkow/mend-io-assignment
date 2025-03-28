package com.mendio.githubtests.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mendio.githubtests.base.BaseTest;
import com.mendio.githubtests.pages.github.home.GitHubHomeActions;
import com.mendio.githubtests.pages.github.search.GitHubSearchResultsActions;
import com.mendio.githubtests.reports.ExtentTestManager;

@Listeners(com.mendio.githubtests.reports.TestListener.class)
public class GitHubSearchTest extends BaseTest {

    @Test
    public void verifySearchReturnResults() {
        ExtentTestManager.getTest().info("Navigating to GitHub Search Results Page");
        GitHubHomeActions home = new GitHubHomeActions(driver);
        home.openHomePage();
        home.openSearch();
        home.searchFor("selenium");

        GitHubSearchResultsActions resultsPage = new GitHubSearchResultsActions(driver);
        ExtentTestManager.getTest().info("Validating Search Results Page");
        assertTrue(resultsPage.isSearchResultsPage(), "Search results page should be displayed.");
        assertTrue(resultsPage.hasResults(), "Search should return at least 1 result.");

        int resultsCount = resultsPage.getResultsCount();
        assertTrue(resultsCount > 0, "Expected search results but found: " + resultsCount);

        String headerText = resultsPage.getHeaderText();
        assertTrue(headerText.contains("results"), "Header text should contain 'results for'.");

        System.out.println("Repositories Found: ");
        resultsPage.getRepositoryNames().forEach(System.out::println);
    }
    
}
