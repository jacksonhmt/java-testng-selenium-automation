package com.jacksonteixeira.driver;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.remote.RemoteWebDriver;

@UtilityClass
public class SessionManager {

    private static final String LOCAL = "local";
    private static final String REMOTE = "remote";

    public static RemoteWebDriver createSession(String browser, String execution) {
        String executionTarget = execution.toLowerCase();
        RemoteWebDriver driver;

        switch (executionTarget) {
            case LOCAL -> driver = new LocalDriverFactory().createDriver(browser);
            case REMOTE -> driver = new RemoteDriverFactory().createDriver(browser);
            default -> throw new IllegalStateException(String.format("unknown %s execution target", executionTarget.toUpperCase()));
        }

        return driver;
    }
}