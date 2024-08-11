package com.jacksonteixeira.pageObject;

import com.jacksonteixeira.config.BasePage;
import com.jacksonteixeira.utils.WaitUtils;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MercadoPage extends BasePage<MercadoPage> {

    @FindBy(id = "menuMercado")
    private WebElement marketButtonId;

    @FindBy(xpath = "//h4[contains(text(),\"Mercado\")]")
    private WebElement marketTitleXpath;

    @FindBy(xpath = "//h5[contains(@class, 'card-title')]")
    private WebElement tituloProduto;

    @FindBy(id = "pesquisar_produto")
    private WebElement productSearchFieldId;

    private final WaitUtils waitUtils;

    public MercadoPage() {
        super();
        this.waitUtils = new WaitUtils(driver);
    }

    @Override
    public MercadoPage abrirPagina() {
        marketButtonId.click();
        return this;
    }

    public MercadoPage limparCampoDePesquisa(){
        productSearchFieldId.clear();
        return this;
    }

    public MercadoPage pesquisarProduto(String nomeProduto){
        productSearchFieldId.sendKeys(nomeProduto);
        return this;
    }
}