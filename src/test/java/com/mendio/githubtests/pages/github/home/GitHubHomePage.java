package com.mendio.githubtests.pages.github.home;

import org.openqa.selenium.By;

public class GitHubHomePage {

    public static final By SIGN_IN_LINK = By.linkText("Sign in");
    public static final By SEARCH_INPUT_BUTTON =  By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/qbsearch-input");
    public static final By SEARCH_INPUT = By.id("query-builder-test");
    
}
