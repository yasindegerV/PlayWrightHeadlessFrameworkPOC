package com.virgosol.utilities;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverPW {

    protected Browser browser;
    protected Page page;


    public Page createPlaywrightPageInstance(String browserTypeAsString) {
        BrowserType browserType = null;
        System.out.println("browserTypeAsString = " + browserTypeAsString);
        switch (browserTypeAsString.toLowerCase()) {
            case "firefox":
                browserType = Playwright.create().firefox();
                break;
            case "chromium":
                browserType = Playwright.create().chromium();
                break;
            case "webkit":
                browserType = Playwright.create().webkit();
                break;

        }
        if (browserType == null) {
            throw new IllegalArgumentException("Browser couldnt opened " + browserTypeAsString);
        }
        browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        return page;

    }
}
