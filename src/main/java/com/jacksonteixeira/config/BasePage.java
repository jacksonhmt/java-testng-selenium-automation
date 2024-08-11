package com.jacksonteixeira.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePage<T extends BasePage<T>> {

    protected WebDriver driver;
    protected Wait<WebDriver> fluentWait;
    protected Wait<WebDriver> wait;
    protected List<String> tabs;

    public BasePage(){
        this.driver = new TestRule().getDriver();
        this.fluentWait = CommonActions.fluentWait(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.tabs = new ArrayList<>();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
    }

    public abstract T abrirPagina();
}
