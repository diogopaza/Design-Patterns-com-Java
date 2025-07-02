public class RelatorioAdministrador extends RelatorioUsuario{

    @Override
    protected void buscarDadosUsuario() {
        this.relatorio.append("Administrador buscando dados do usuario \n");
    }

    @Override
    protected void processarDados() {
        this.relatorio.append("Administrador processando dados\n");
    }

    @Override
    protected void exportarDados() {
        this.relatorio.append("Administrador exportando dados\n");
    }

    @Override
    protected void adicionarInformacoesExtras() {
        this.relatorio.append("Dados globais da empresa\n");
    }
}
