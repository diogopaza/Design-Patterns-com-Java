import email.EmailService;

public class RelatorioCliente extends RelatorioUsuario {

    private EmailService emailService;

    public RelatorioCliente(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    protected void buscarDadosUsuario() {
        this.relatorio.append("Cliente buscando dados do usuario \n");
    }

    @Override
    protected void processarDados() {
        this.relatorio.append("Cliente processando dados\n");
    }

    @Override
    protected void exportarDados() {
        this.relatorio.append("Cliente exportando dados\n");
    }

    @Override
    protected void adicionarInformacoesExtras() {
        this.relatorio.append("Informações de compras\n");
    }

    @Override
    protected void enviarRelatorioPorEmail() {
        var email = this.emailService.enviarEmail("diogo@diogo.com",
                "administrador@empresa.com",
                "Assunto do email");
        this.relatorio.append(email+"\n");
    }
}
