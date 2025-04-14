package br.com.diogo.designpatternnullobject.service;

import java.math.BigDecimal;

public class Carrinho implements CarrinhoInterface{

    private BigDecimal valor;
    private Integer tamanho;
    private String userName;
    private String nomeUsuario;

    public Boolean isEmpty() {
        if (valor == null && tamanho == null
                && nomeUsuario == null && userName == null) {
            return true;
        }
        return false;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public Integer getTamanho() {
        return tamanho;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getNomeUsuario() {
        return nomeUsuario;
    }


    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
