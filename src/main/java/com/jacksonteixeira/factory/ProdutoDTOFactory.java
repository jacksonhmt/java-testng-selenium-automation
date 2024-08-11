package com.jacksonteixeira.factory;

import com.jacksonteixeira.dto.ProdutoDTO;

public class ProdutoDTOFactory {

    public static ProdutoDTO criarProdutoPadrao() {
        return new ProdutoDTO(
                "Iphone",
                "5",
                "5000",
                "6000",
                "Celular",
                "Iphone XR 64GB"
        );
    }
}
