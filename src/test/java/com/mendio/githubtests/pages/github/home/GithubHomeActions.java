package com.mendio.githubtests.pages.github.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomeActions {

    private WebDriver driver;

    public GithubHomeActions(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://github.com");
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public boolean isSignInLinkVisible() {
        WebElement signInLink = driver.findElement(GitHubHomeElements.SIGN_IN_LINK);
        return signInLink.isDisplayed();
    }
    
}
