package com.jacksonteixeira.driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface IDriver {

   RemoteWebDriver createDriver(String browser);
}