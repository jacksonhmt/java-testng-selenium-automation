package com.jacksonteixeira.pageObject;

import com.jacksonteixeira.config.BasePage;
import com.jacksonteixeira.utils.WaitUtils;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage<DashboardPage> {

    private final By viewProductId = By.id("buttonVisualizarProdutos");

    private final WaitUtils waitUtils;

    public DashboardPage() {
        super();
        this.waitUtils = new WaitUtils(driver);
    }

    @Override
    public DashboardPage abrirPagina() {
        return null;
    }

    public void clickOnTheViewProductButton() {

    }
}
