package com.mendio.githubtests.pages.github.auth;

import org.openqa.selenium.By;

public class GitHubSignInPage {

    public static final By USERNAME = By.id("login_field");
    public static final By PASSWORD = By.id("password");
    public static final By SIGN_IN_BUTTON = By.name("commit");
    public static final By ERROR_MESSAGE = By.cssSelector("div.flash-error");
}
