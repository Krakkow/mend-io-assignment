package com.mendio.githubtests.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mendio.githubtests.base.BaseTest;
import com.mendio.githubtests.pages.github.home.GitHubHomeActions;
import com.mendio.githubtests.reports.ExtentTestManager;
import com.mendio.githubtests.utils.WebDriverUtils;
@Listeners(com.mendio.githubtests.reports.TestListener.class)
public class GitHubHomePageTest extends BaseTest{

    @Test
    public void veirfyHomePageLoadsCorrectly() {
        GitHubHomeActions home = new GitHubHomeActions(driver);
        WebDriverUtils utils = new WebDriverUtils(driver);
        ExtentTestManager.getTest().info("Navigating to GitHub Home Page");
        home.openHomePage();
        ExtentTestManager.getTest().info("Validating Correct Landing Page");
        assertTrue(utils.getTitle().toLowerCase().contains("github"), "Home page title should contain GitHub.");
        assertTrue(home.isSignInLinkVisible(), "Sign in link should be visible.");
    }
    
}
