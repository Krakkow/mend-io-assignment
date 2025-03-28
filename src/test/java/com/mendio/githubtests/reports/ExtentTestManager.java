package com.mendio.githubtests.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
    private static final ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return testThread.get();
    }

    public static void startTest(String testName) {
        ExtentTest test = ExtentManager.getInstance().createTest(testName);
        testThread.set(test);
    }
}
