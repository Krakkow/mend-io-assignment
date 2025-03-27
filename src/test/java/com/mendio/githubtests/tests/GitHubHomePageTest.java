package com.mendio.githubtests.tests;

import org.testng.annotations.Test;

import com.mendio.githubtests.base.BaseTest;
import com.mendio.githubtests.pages.github.home.GitHubHomeActions;
import com.mendio.githubtests.utils.WebDriverUtils;

import static org.testng.Assert.assertTrue;

public class GitHubHomePageTest extends BaseTest{

    @Test
    public void veirfyHomePageLoadsCorrectly() {
        GitHubHomeActions home = new GitHubHomeActions(driver);
        WebDriverUtils utils = new WebDriverUtils(driver);
        home.openHomePage();
        assertTrue(utils.getTitle().toLowerCase().contains("github"), "Home page title should contain GitHub.");
        assertTrue(home.isSignInLinkVisible(), "Sign in link should be visible.");
    }
    
}
