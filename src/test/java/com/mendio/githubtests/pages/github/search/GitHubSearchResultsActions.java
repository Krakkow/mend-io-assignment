package com.mendio.githubtests.pages.github.search;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mendio.githubtests.utils.WebDriverUtils;

public class GitHubSearchResultsActions {

    private WebDriver driver;
    private WebDriverUtils utils = new WebDriverUtils(driver);
    
    public GitHubSearchResultsActions(WebDriver driver) {
        this.driver = driver;
        this.utils = new WebDriverUtils(driver);
    }

    public boolean hasResults(){
       List<WebElement> results = utils.findElements(GitHubSearchResultsPage.RESULT_ITEMS);
       return !results.isEmpty(); 
    }

    public int getResultsCount() {
        return utils.findElements(GitHubSearchResultsPage.RESULT_ITEMS).size();
    }

    public List<String> getRepositoryNames() {
        List<WebElement> results = utils.findElements(GitHubSearchResultsPage.RESULT_ITEMS);
        return results.stream().map(WebElement::getText).toList();
    }

    public String getHeaderText() {
        return utils.getTextFromElement(GitHubSearchResultsPage.RESULT_HEADER);
    }

    public boolean isSearchResultsPage() {
        utils.waitUntilVisible(GitHubSearchResultsPage.RESULT_HEADER);
        String pageTitle = utils.getTitle();
        System.out.println("Page Title: " + pageTitle);
        return utils.getTitle().contains("search results");
    }
    
}
