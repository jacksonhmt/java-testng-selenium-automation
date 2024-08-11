package com.jacksonteixeira.driver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverFactory implements IDriver {

    @Override
    public RemoteWebDriver createDriver(String browser) {
        try {
            return new RemoteWebDriver(new URL("http://localhost:4444/"), getCapability(browser));
        } catch (MalformedURLException e) {
            throw new SessionNotCreatedException("Incorrect selenium grid URL!", e);
        }
    }

    private MutableCapabilities getCapability(String browser) {
        MutableCapabilities capabilities;
        DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());

        switch (driverManagerType) {
            case CHROME -> capabilities = new ChromeOptions();
            case FIREFOX -> capabilities = new FirefoxOptions();
            case EDGE -> capabilities = new EdgeOptions();
            case IEXPLORER -> capabilities = new InternetExplorerOptions();
            default -> throw new IllegalStateException(String.format("%s has no capabilities implemented!", browser.toUpperCase()));
        }

        return capabilities;
    }
}