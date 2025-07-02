package email;

import java.util.Optional;

public class EmailFactory {

    private EmailService emailService;

    public static EmailService getEmailService(EmailService emailService) {
        return emailService == null ? new NullEmailService() : new RealEmailService();
    }
}
