package com.jacksonteixeira.tests;

import com.jacksonteixeira.config.TestRule;
import com.jacksonteixeira.dto.ProdutoDTO;
import com.jacksonteixeira.factory.ProdutoDTOFactory;
import com.jacksonteixeira.pageObject.ProdutoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jacksonteixeira.enums.MensagemEnum.*;

public class ProdutoTest extends TestRule {

    @Test(testName = "[Produtos] - Pesquisando Produtos Cadastrados")
    public void pesquisandoProdutos() {
        String mensagemSucesso = MENSAGEM_SUCESSO.getMessage();
        ProdutoDTO produtoDTO = ProdutoDTOFactory.criarProdutoPadrao();
        ProdutoPage produtoPage = new ProdutoPage().abrirPagina()
                .preencherCampos(produtoDTO)
                .clicarSalvar();

        Assert.assertEquals(produtoPage.esperarMensagem(mensagemSucesso).getText(), mensagemSucesso);
    }
}
