package com.mendio.githubtests.tests;

import org.testng.annotations.Test;

import com.mendio.githubtests.base.BaseTest;
import com.mendio.githubtests.pages.github.auth.GitHubSignInActions;
import com.mendio.githubtests.pages.github.home.GitHubHomeActions;
import static org.testng.Assert.assertTrue;

public class GitHubSignInTest extends BaseTest {
    
    @Test
    public void verifySignInPageIsAccessible() {
        GitHubHomeActions home = new GitHubHomeActions(driver);
        home.openHomePage();
        home.clickOnSignIn();

        GitHubSignInActions signIn = new GitHubSignInActions(driver);

        assertTrue(signIn.isSignInPage(), "Sign In page is not accessible");
        assertTrue(signIn.isSignInFormVisible(), "Sign In form is not visible");
    }

    @Test
    public void verifyFailedSignIn() {
        GitHubHomeActions home = new GitHubHomeActions(driver);
        home.openHomePage();
        home.clickOnSignIn();

        GitHubSignInActions signIn = new GitHubSignInActions(driver);

        assertTrue(signIn.isSignInPage(), "Sign In page is not accessible");
        assertTrue(signIn.isSignInFormVisible(), "Sign In form is not visible");

        signIn.failSignIn("invalid", "invalid");

        assertTrue(signIn.isErrorDisplayed(), "Error message is not displayed");
        assertTrue(signIn.getErrorMessage().contains("Incorrect username or password."), "Error message is not correct");
    }
    
}
