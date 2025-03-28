package com.mendio.githubtests.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

    private WebDriver driver;
    private WebDriverWait wait;
    
    public WebDriverUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement waitUntilVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean isVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public boolean doesElementExist(By locator){
        return !driver.findElements(locator).isEmpty();
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void click(By locator) {
        waitUntilVisible(locator).click();
    }

    public void type(By locator, String text) {
        WebElement element = waitUntilVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    public void typeAndSubmit(By locator, String text) {
        WebElement element = waitUntilVisible(locator);
        element.clear();
        element.sendKeys(text);
        element.submit();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getTextFromElement(By locator) {
        return waitUntilVisible(locator).getText();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    
}
