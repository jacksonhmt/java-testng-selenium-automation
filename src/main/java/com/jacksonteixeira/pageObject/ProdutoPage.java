package com.jacksonteixeira.pageObject;

import com.jacksonteixeira.config.BasePage;
import com.jacksonteixeira.dto.ProdutoDTO;
import com.jacksonteixeira.utils.WaitUtils;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ProdutoPage extends BasePage<ProdutoPage> {

    @FindBy(id = "menuProduto")
    private WebElement productButtonId;

    @FindBy(id = "cadastrarProduto")
    private WebElement idCampoCadastrarProduto;

    @FindBy(id = "inputNomeProduto")
    private WebElement idCampoNomeProduto;

    @FindBy(id = "inputQuantidade")
    private WebElement idCampoQuantidade;

    @FindBy(id = "inputPrecoCompra")
    private WebElement idCampoPrecoCompra;

    @FindBy(id = "inputPrecoVenda")
    private WebElement idCampoPrecoVenda;

    @FindBy(id = "inputTipoProduto")
    private WebElement idCampoTipoProduto;

    @FindBy(id = "inputDescricao")
    private WebElement idCampoDescricao;

    @FindBy(id = "inputImagemProduto")
    private WebElement idCampoImagem;

    @FindBy(tagName = "iframe")
    private WebElement tagNameIframeDescricao;

    @FindBy(tagName = "body")
    private WebElement tagNameBodyCampoDescricao;

    @FindBy(id = "buttonSalvar")
    private WebElement idBotaoSalvar;

    @FindBy(id = "toast-container")
    private WebElement toastContainerId;

    private final WaitUtils waitUtils;

    public ProdutoPage() {
        super();
        this.waitUtils = new WaitUtils(driver);
    }

    @Override
    public ProdutoPage abrirPagina() {
        productButtonId.click();
        idCampoCadastrarProduto.click();
        return this;
    }

    public ProdutoPage preencherCampoImagemProduto(){
        String caminhoProjeto = System.getProperty("user.dir");
        String caminhArquivo = caminhoProjeto + "/files/arquitetura do projeto.png";

        idCampoImagem.sendKeys(caminhArquivo);
        return this;
    }

    public ProdutoPage preencherNomeProduto(String nomeProduto){
        idCampoNomeProduto.sendKeys(nomeProduto);
        return this;
    }

    public ProdutoPage preencherQuantidade(String quantidade){
        idCampoQuantidade.sendKeys(quantidade);
        return this;
    }

    public ProdutoPage preencherPrecoCompra(String precoCompra){
        idCampoPrecoCompra.sendKeys(precoCompra);
        return this;
    }

    public ProdutoPage preencherPrecoVenda(String precoVenda){
        idCampoPrecoVenda.sendKeys(precoVenda);
        return this;
    }

    public ProdutoPage preencherTipoProduto(String tipoProduto){
        idCampoTipoProduto.sendKeys(tipoProduto);
        return this;
    }

    public ProdutoPage preencherCampoDescricao(String descricao){
        driver.switchTo().frame(tagNameIframeDescricao);
        tagNameBodyCampoDescricao.clear();
        tagNameBodyCampoDescricao.sendKeys(descricao);
        driver.switchTo().defaultContent();
        return this;
    }

    public ProdutoPage preencherCampos(ProdutoDTO produtoDTO){
        new ProdutoPage().preencherCampoImagemProduto()
                .preencherNomeProduto(produtoDTO.getNome())
                .preencherQuantidade(produtoDTO.getQuantidade())
                .preencherPrecoCompra(produtoDTO.getPrecoCompra())
                .preencherPrecoVenda(produtoDTO.getPrecoVenda())
                .preencherTipoProduto(produtoDTO.getTipoProduto())
                .preencherCampoDescricao(produtoDTO.getDescricao());
        return this;
    }

    public ProdutoPage clicarSalvar(){
        idBotaoSalvar.click();
        return this;
    }

    public WebElement esperarMensagem(String mensagem){
        waitUtils.waitForTextToBePresentInElement(toastContainerId, mensagem);
        return toastContainerId;
    }
}
