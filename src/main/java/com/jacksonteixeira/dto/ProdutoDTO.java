package com.jacksonteixeira.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProdutoDTO {
    private String nome;
    private String quantidade;
    private String precoCompra;
    private String precoVenda;
    private String tipoProduto;
    private String descricao;
}