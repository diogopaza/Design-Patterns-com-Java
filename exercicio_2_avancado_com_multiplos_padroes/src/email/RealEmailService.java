package email;

public class RealEmailService implements EmailService{

    @Override
    public String enviarEmail(String remetente, String destinatario, String mensagem) {
        String resposta = """
                %s esta enviando email para
                %s com essa mensagem:
                %s                
                """.formatted(remetente, destinatario, mensagem);
        return resposta;
    }
}
