public class CadastroFuncionario extends CadastroUsuario{
    @Override
    String validarDados() {
        return "validando número de registro (matrícula)";
    }

    @Override
    String salvarNoBanco() {
        return "salvando dados do FUNCIONARIO";
    }

    @Override
    String enviarEmail() {
        return "enviando e-mail com orientações da empresa";
    }
}
