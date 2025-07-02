package email;

public class NullEmailService implements EmailService{
    @Override
    public String enviarEmail(String remetente, String destinatario, String mensagem) {
        return "";
    }
}
