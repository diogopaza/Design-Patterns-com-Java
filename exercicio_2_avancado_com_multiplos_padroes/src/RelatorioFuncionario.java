public class RelatorioFuncionario extends RelatorioUsuario {

    @Override
    protected void buscarDadosUsuario() {
        this.relatorio.append("Funcionario buscando dados do usuario \n");
    }

    @Override
    protected void processarDados() {
        this.relatorio.append("Funcionario processando dados\n");
    }

    @Override
    protected void exportarDados() {
        this.relatorio.append("Funcionario exportando dados\n");
    }

    @Override
    protected void adicionarInformacoesExtras() {
        this.relatorio.append("Dados de produtividade\n");
    }
}
