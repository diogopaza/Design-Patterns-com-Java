package br.com.diogo.designpatternnullobject.dto;

import java.math.BigDecimal;

public record CarrinhoDto(BigDecimal valor, Integer tamanho,
                          String userName, String nomeUsuario) {
}
