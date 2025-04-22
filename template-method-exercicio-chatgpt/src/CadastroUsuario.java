public abstract class CadastroUsuario {

    public final void processarCadastro() {
        System.out.println("INICIANDO CADASTRO TEMPLATE METHOD");
        System.out.println(validarDados());
        System.out.println(this.salvarNoBanco());
        System.out.println(this.enviarEmail());
    }

    abstract String validarDados();

    abstract String salvarNoBanco();

    abstract String enviarEmail();
}
