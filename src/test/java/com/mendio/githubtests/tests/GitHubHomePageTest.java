package com.mendio.githubtests.tests;

import org.testng.annotations.Test;

import com.mendio.githubtests.base.BaseTest;
import com.mendio.githubtests.pages.github.home.GithubHomeActions;

import static org.testng.Assert.assertTrue;

public class GitHubHomePageTest extends BaseTest{

    @Test
    public void veirfyHomePageLoadsCorrectly() {
        GithubHomeActions home = new GithubHomeActions(driver);
        home.openHomePage();
        assertTrue(home.getTitle().contains("GitHub"), "Home page title should contain GitHub.");
        assertTrue(home.isSignInLinkVisible(), "Sign in link should be visible.");
    }
    
}
