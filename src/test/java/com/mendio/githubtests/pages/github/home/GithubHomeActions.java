package com.mendio.githubtests.pages.github.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mendio.githubtests.utils.WebDriverUtils;

public class GitHubHomeActions {

    private WebDriver driver;
    private WebDriverUtils utils;

    public GitHubHomeActions(WebDriver driver) {
        this.driver = driver;
        this.utils = new WebDriverUtils(driver);
    }

    public void openHomePage() {
        driver.get("https://github.com");
    }

    public boolean isSignInLinkVisible() {
        WebElement signInLink = driver.findElement(GitHubHomePage.SIGN_IN_LINK);
        return signInLink.isDisplayed();
    }

    public void openSearch() {
        utils.click(GitHubHomePage.SEARCH_INPUT_BUTTON);
    }

    public void searchFor(String searchInput) {
        utils.typeAndSubmit(GitHubHomePage.SEARCH_INPUT, searchInput);
        }
    }
    
