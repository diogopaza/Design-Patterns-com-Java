import email.EmailFactory;
import email.EmailService;
import email.NullEmailService;
import email.RealEmailService;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final Map<Integer, Class<? extends RelatorioUsuario>> map = new HashMap<Integer, Class<? extends RelatorioUsuario>>();

        //Etapa 1, design pattern Template Method
        /*
        map.put(1, RelatorioCliente.class);
        map.put(2, RelatorioFuncionario.class);
        map.put(3, RelatorioAdministrador.class);
        executar(map.get(3));
        */

        //Etapa 2, refatorando incluindo design pattern Null Object
        // Refatorando - incluindo classes para envio de email e simulacao de objjeto nulo
        // Mais abaixo temos o teste criado pelo chtgpt
       /* RealEmailService email = new RealEmailService();
        var relatorio = new RelatorioCliente(email);
        relatorio.gerarRelatorio();*/

        // Teste criado pelo chatgpt
        System.out.println("=== Teste 1 com RealEmailService ===");
        EmailService emailReal = new RealEmailService();
        var relatorio1 = new RelatorioCliente(emailReal);
        relatorio1.gerarRelatorio();

        System.out.println("\n=== Teste 2  com NullEmailService ===");
        EmailService emailNulo = new NullEmailService();
        var relatorio2 = new RelatorioCliente(emailNulo);
        relatorio2.gerarRelatorio();

        // Testes com o design patter Factory incluso -- tambem desenvolvido pelo Chatgpt
        System.out.println("=== Teste 3: EmailService real passado ===");
        EmailService real = new RealEmailService();
        EmailService resultado1 = EmailFactory.getEmailService(real);
        System.out.println("Instância: " + resultado1.getClass().getSimpleName());

        System.out.println("\n=== Teste 4: null passado ===");
        EmailService resultado2 = EmailFactory.getEmailService(null);
        System.out.println("Instância: " + resultado2.getClass().getSimpleName());




    }

    public static <T extends RelatorioUsuario> void executar(Class<T> classe) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        RelatorioUsuario relatorio = classe.getConstructor().newInstance();
        relatorio.gerarRelatorio();
    }
}