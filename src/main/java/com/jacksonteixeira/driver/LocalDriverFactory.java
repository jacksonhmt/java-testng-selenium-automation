package com.jacksonteixeira.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LocalDriverFactory implements IDriver {

    @Override
    public RemoteWebDriver createDriver(String browser) {
        try {
            DriverManagerType driverType = DriverManagerType.valueOf(browser.toUpperCase());
            Class<?> driverClass = Class.forName(driverType.browserClass());
            WebDriverManager.getInstance(driverType).setup();
            return (RemoteWebDriver) driverClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new SessionNotCreatedException(String.format("%s is not installed", browser.toUpperCase()), e);
        }
    }
}