public class CadastroCliente extends CadastroUsuario{
    @Override
    String validarDados() {
        return "validando CPF do ClIENTE";
    }

    @Override
    String salvarNoBanco() {
        return "salvando os dados do CLIENTE";
    }

    @Override
    String enviarEmail() {
        return "e-mail com desconto de boas-vindas";
    }
}
