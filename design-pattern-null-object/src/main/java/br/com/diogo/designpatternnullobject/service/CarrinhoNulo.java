package br.com.diogo.designpatternnullobject.service;

import br.com.diogo.designpatternnullobject.dto.CarrinhoDto;

import java.math.BigDecimal;

public class CarrinhoNulo extends Carrinho implements CarrinhoInterface{

    @Override
    public BigDecimal getValor() {
        return new BigDecimal(0);
    }

    @Override
    public Integer getTamanho() {
        return Integer.valueOf(0);
    }

    @Override
    public String getUserName() {
        return "";
    }

    @Override
    public String getNomeUsuario() {
        return "Login";
    }

}
