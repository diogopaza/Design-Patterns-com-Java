public abstract class RelatorioUsuario {

    protected StringBuilder relatorio = new StringBuilder();

    public final void gerarRelatorio() {
        this.buscarDadosUsuario();
        this.processarDados();
        this.adicionarInformacoesExtras();
        this.exportarDados();
        this.enviarRelatorioPorEmail();
        System.out.println(this.relatorio);
    }

    protected abstract void buscarDadosUsuario();

    protected abstract void processarDados();

    protected void adicionarInformacoesExtras() {
    }

    protected abstract void exportarDados();

    protected void enviarRelatorioPorEmail() {
    }


}
