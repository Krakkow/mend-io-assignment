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
        WebElement signInLink = utils.findElement(GitHubHomePage.SIGN_IN_LINK);
        return signInLink.isDisplayed();
    }

    public void clickOnSignIn() {
        if (utils.doesElementExist(GitHubHomePage.SIGN_IN_LINK)) {
            utils.click(GitHubHomePage.SIGN_IN_LINK);
        } else {
            throw new IllegalStateException("Sign In link is not visible");
        }
    }

    public void openSearch() {
        utils.click(GitHubHomePage.SEARCH_INPUT_BUTTON);
    }

    public void searchFor(String searchInput) {
        utils.typeAndSubmit(GitHubHomePage.SEARCH_INPUT, searchInput);
        }
    }
    
