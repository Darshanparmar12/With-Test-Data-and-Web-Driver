package org.example;

import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    public void setUp() {
        browserManager.openBrowser();
    }


    //  @AfterMethod
    public void tearDown() {
        browserManager.closeBrowser();

    }
}

