package com.jacksonteixeira.config;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.jacksonteixeira.driver.SessionManager;
import com.jacksonteixeira.pageObject.DashboardPage;
import com.jacksonteixeira.pageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

@Listeners(ExtentITestListenerClassAdapter.class)
public class TestRule {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver(){
        return driver.get();
    }

    @BeforeTest
    @Parameters({"browser", "execution"})
    public void setUp(@Optional("chrome") String browser, @Optional("local") String execution){
        driver.set(SessionManager.createSession(browser, execution));
        getDriver().manage().window().maximize();

        LoginPage loginPage = new LoginPage();
        DashboardPage realizandoLogin = loginPage.abrirPagina()
                .preencherEmail("plataforma@jacksonteixeira.com")
                .preencherSenha("plataformaJT")
                .clicarBotaoEntrar();
    }

    @BeforeClass
    public void navegarParaPaginaDashboard(){

    }

    @AfterTest
    public void tearDown() {
        getDriver().quit();
        driver.remove();
    }
}
