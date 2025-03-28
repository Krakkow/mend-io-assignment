package com.mendio.githubtests.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static final ExtentReports extent = new ExtentReports();

    static {
        ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        reporter.config().setReportName("Mend.io Assignment Report");
        reporter.config().setDocumentTitle("Test Execution Report");

        extent.attachReporter(reporter);
    }

    public static ExtentReports getInstance() {
        return extent;
    }
}

