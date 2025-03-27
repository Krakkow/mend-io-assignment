package com.mendio.githubtests.pages.github.auth;

import org.openqa.selenium.WebDriver;

import com.mendio.githubtests.utils.WebDriverUtils;

public class GitHubSignInActions {

    private WebDriver driver;
    private WebDriverUtils utils = new WebDriverUtils(driver);

    public GitHubSignInActions(WebDriver driver) {
        this.driver = driver;
        this.utils = new WebDriverUtils(driver);
    }

    public boolean isSignInPage() {
        return utils.getCurrentUrl().contains("login");
    }

    public boolean isSignInFormVisible() {
        return utils.isVisible(GitHubSignInPage.USERNAME) && utils.isVisible(GitHubSignInPage.PASSWORD) && utils.isVisible(GitHubSignInPage.SIGN_IN_BUTTON);
    }

    public void failSignIn(String username, String password) {
        if (isSignInFormVisible()) {
            utils.type(GitHubSignInPage.USERNAME, username);
            utils.type(GitHubSignInPage.PASSWORD, password);
            utils.click(GitHubSignInPage.SIGN_IN_BUTTON);
        } else {
            throw new IllegalStateException("Sign In form is not visible");
        }
    }

    public boolean isErrorDisplayed() {
        return utils.isVisible(GitHubSignInPage.ERROR_MESSAGE);
    }

    public String getErrorMessage() {
        return utils.getTextFromElement(GitHubSignInPage.ERROR_MESSAGE);
    }
    
}
