package br.com.diogo.designpatternnullobject.controller;

import br.com.diogo.designpatternnullobject.dto.CarrinhoDto;
import br.com.diogo.designpatternnullobject.service.Carrinho;
import br.com.diogo.designpatternnullobject.service.CarrinhoInterface;
import br.com.diogo.designpatternnullobject.service.CarrinhoNulo;
import br.com.diogo.designpatternnullobject.service.CookieFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("compras")
public class controller {

    @PostMapping
    public Map<String, String> comprar(@RequestBody(required = false) Carrinho carrinho) {


        CarrinhoInterface c = carrinho.isEmpty() ? new CarrinhoNulo() : carrinho;

        Map<String, String> minhasCompras = new HashMap<>();
        /*removemos o if pois com o Design Patter Null Object
          nao há problema nos valores recebidos serem nulos, pois o padrao trata isso
          retornando valores pre definidos
        * */
       // if(c != null) {
            minhasCompras.put("COMPRAS_VALOR: ", c.getValor().toString());
            minhasCompras.put("COMPRAS_QUANTIDADE: ", String.valueOf(c.getTamanho()));
      //  } else {
     //       minhasCompras.put("COMPRAS_VALOR: ", "0.0");
     //       minhasCompras.put("COMPRAS_QUANTIDADE: ", "0");
     //   }
        if(c.getUserName() == null) {
            if (c != null) {
                minhasCompras.put("USER_CARRINHO", c.getNomeUsuario());
            } else {
                minhasCompras.put("USER_CARRINHO", "LOGIN");
            }
        } else {
            minhasCompras.put("USER_CARRINHO", c.getUserName());
        }
        if( minhasCompras.containsKey("COMPRAS_VALOR: ")) {
            System.out.println(minhasCompras.get("COMPRAS_VALOR: "));
        }

        return minhasCompras;
    }
}




