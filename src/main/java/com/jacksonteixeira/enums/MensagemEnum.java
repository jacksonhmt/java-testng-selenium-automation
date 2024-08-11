package com.jacksonteixeira.enums;

public enum MensagemEnum {
    MENSAGEM_SUCESSO("Produto cadastrado com sucesso!"),;

    final String message;

    MensagemEnum(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
