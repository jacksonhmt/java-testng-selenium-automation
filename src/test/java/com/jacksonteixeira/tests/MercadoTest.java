package com.jacksonteixeira.tests;

import com.jacksonteixeira.config.TestRule;
import com.jacksonteixeira.pageObject.MercadoPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MercadoTest extends TestRule {

    @DataProvider(name = "[Mercado] - Pesquisando Produtos")
    public static Object[][] getProdutoItems(){
        return new Object[][]{
                {"Monitor 18 Polegadas"},
                {"Teclado"},
                {"Teclado Mecânico"}
        };
    }

    @Test(dataProvider = "[Mercado] - Pesquisando Produtos")
    public void pesquisandoProdutos(String produtos){
        MercadoPage mercadoPage = new MercadoPage().abrirPagina()
                .limparCampoDePesquisa()
                .pesquisarProduto(produtos);

        Assert.assertEquals(mercadoPage.getTituloProduto().getText(), produtos);
    }
}
