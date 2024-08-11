package com.jacksonteixeira.pageObject;

import com.jacksonteixeira.config.BasePage;
import com.jacksonteixeira.utils.WaitUtils;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage<LoginPage> {

    @FindBy(id = "email")
    private WebElement emailFieldID;

    @FindBy(id = "senha")
    private WebElement passwordFieldId;

    @FindBy(id = "buttonLogin")
    private WebElement enterButtonId;

    @FindBy(id = "toast-container")
    private WebElement toastContainerId;

    @FindBy(xpath = "//small[contains(text(),\"E-mail é obrigatorio!\")]")
    private WebElement messageRequiredLoginXpath;

    @FindBy(xpath = "//small[contains(text(), \"Senha é obrigatório!\")]")
    private WebElement messageRequiredPasswordXpath;

    private final WaitUtils waitUtils;

    public LoginPage() {
        super();
        this.waitUtils = new WaitUtils(driver);
    }

    @Override
    public LoginPage abrirPagina(){
        driver.get("https://www.jacksonteixeira.com/plataforma");
        return this;
    }

    public LoginPage preencherEmail(String email){
        emailFieldID.sendKeys(email);
        return this;
    }

    public LoginPage preencherSenha(String senha){
        passwordFieldId.sendKeys(senha);
        return this;
    }

    public DashboardPage clicarBotaoEntrar(){
        enterButtonId.click();
        return new DashboardPage();
    }
}