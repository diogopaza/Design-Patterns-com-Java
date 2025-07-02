package email;

public interface EmailService {

    String enviarEmail(String remetente, String destinatario, String mensagem);
}
