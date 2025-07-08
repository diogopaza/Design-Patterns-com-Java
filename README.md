# Design-Patterns-com-Java

<h3>Orientação a Objetos - Noções</h3>
<p>
  <strong>Revisando modificadores de metodos</strong><br/>
  <ul>
    <li>abstract: somente pode ser usado em classes abstratas e interfaces no Java, esse tipo de metodo nao contem um corpo, ou seja, nao tem uma implementacao. Metodos abstratos obrigam subclasses a implementa-los, atraves da sobreescrita de metodos (um dos usos de Polimorfismo - <emph>overriding</emph>).</li>
    <li>final: metodos final nao podem ser sobreescritos por subclasses, isso garante que o comportamento no metodo nao sera alterado.</li>
    <li>private: metodos private sao acessiveis apenas pela propria classe (principio da OO de Encapsulamento).</li>
    <li>protected ou public: metodos public sao acessiveis por qualquer classe e metodos protected sao acessiveis pelas subclasses no mesmo pacote e nas subclasses (heranca), mesmo que estejam em outros pacotes..</li>
  </ul>

  
</p>


<h3>Strategy</h3>
<p>Objetivo: encapsular um algoritmo dentro de uma classe.</p>
<p>O padrao Strategy necessita de diversas variacoes de um algoritmo. </p>
<p>Exercicio: Implemente o padrao Strategy onde um passageiro possa definir uma das tres formas de viagem: carro, onibus ou aviao:</p>

<h3>Null Object</h3>
<p>Esse padrao introduz um novo comportamento que ira eliminar a necessidade do uso de condicionais. </p>
<p>O padrao Null Object propoe a criacao de uma classe para representar objetos nulos em uma aplicacao. Essa classe deve implementar a mesma interface da classe original. Tambem deve implementar seus metodos de forma a executar o comportamento esperado da aplicacao quando um valor nulo for recebido. Dessa forma, em vez de retornar um valor nulo, retorna-se uma istancia dessa nova classe.</p>
<p>O projeto <strong>design-pattern-null-object</strong> disponivel nesse repositorio e um exemplo do uso do design pattern Null Obejct. A imagem abaixo demonstra graficamente o uso do padrao, onde o <strong>Client</strong> faz uma requisicao e um objeto sera instanciado a partir do metodo <strong>doSomething()</strong> porem e possivel definir em tempo de execucao se o objeto sera um <strong>RealObject</strong> ou  um <strong>NullObject</strong> tratando valores nulos.</p>

![image](https://github.com/user-attachments/assets/9e8d4d80-e14b-47ac-8297-8746bcdc8086)


<h3>Template Method</h3>
<p>Um Template Method e um modelo de algoritmo que possui algumas partes fixas e algumas partes variaveis. As partes variaveis sao lacunas que precisam ser completadas para que o algoritmo realmente faca sentido. As lacunas sao representadas como <emph>hook methods</emph> que podem ser implementadas nas subclasses. Caso seja uma lacuna obrigatoria, o metodo deve ser definido como abstrato e caso a implementacao seja opcional, o metodo pode ser concreto e normalmente possui implementacao vazia. 

A imagem abaixo ilustra o uso do Template Method, o qual, possui um Cliente, que faz uma requisicao,e possivel notar duas classes ImplementationA e ImplementationB que estendem de AbstractTemplete. A classe AbstractTemplate e uma classe abstrata e possui tres metodos o metodo templateMethod e o modelo que representa a logica a ser implementada (etapas especificas para as subclasses implementarem ou sobreescreverem), podendo inclusive ser um metodo definido como <strong>final</strong> para nao permitir que seja alterado por alguma subclasse. E os metodos step1(), step2(), step3() sao os metodos que devem ser reescritos, esses geralmente sao metodos abstratos. <strong> Resumidamente o metodo templateMethod define a estrutura do algoritmo, e os metodos  step1(), step2(), step3() sao os ganchos onde as subclasses injetam seu comportamento. </strong> 

![image](https://github.com/user-attachments/assets/694d555e-9b65-4d9e-8ad7-f2cde86fee94)

</p>


<h3>Exercicios</h3>
<p><strong>Exercicio Template Method: Resolucao no projeto template-method-exercicio-chatgpt</strong><br>
<strong>Cenario:</strong>
Você está desenvolvendo um sistema de cadastro de usuários. O processo de cadastro é parecido para diferentes tipos de usuários, mas com variações específicas em cada etapa.
<br>
 Crie uma classe base abstrata chamada <strong>CadastroUsuario</strong> que define o processo de cadastro em etapas.
        <br><br>
        O método que define o fluxo do processo deve ser <code>final</code>, ou seja, não pode ser alterado nas subclasses.
        <br><br>
        As etapas do processo devem ser:
        <ul>
            <li>Validar os dados</li>
            <li>Salvar no banco</li>
            <li>Enviar e-mail de confirmação</li>
        </ul>
        Agora crie duas subclasses que implementam as variações:
        <br><br>
        <strong>CadastroCliente</strong>
        <ul>
            <li>Valida CPF</li>
            <li>Salva os dados do cliente</li>
            <li>Envia e-mail com desconto de boas-vindas</li>
        </ul>
        <strong>CadastroFuncionario</strong>
        <ul>
            <li>Valida número de registro (matrícula)</li>
            <li>Salva os dados do funcionário</li>
            <li>Envia e-mail com orientações da empresa</li>
        </ul>
        <br>
        Crie uma classe com o <code>main()</code> e simule o cadastro de um cliente e de um funcionário. Cada um deve imprimir no console o passo-a-passo do seu cadastro.
  
</p>
<hr>

<h2>Exercício Avançado - Template Method + Null Object Pattern + SOLID + Injeção de Dependência Manual</h2>
<h4>Esse exercicio foi criado junto com o ChatGpt e o codigo esta disponível no projeto == exercicio_2_avancado_com_multiplos_padroes</h4>
    <h2>Projeto:</h2>
    <p><strong>template-method-exercicio-avancado</strong></p>
    <h2>Objetivo Geral:</h2>
    <p>Criar um sistema de geração de relatórios para diferentes tipos de usuários, aplicando os seguintes conceitos:</p>
    <ul>
        <li>Template Method Pattern</li>
        <li>Hook Methods (opcionais)</li>
        <li>Null Object Pattern</li>
        <li>Princípios SOLID</li>
        <li>Injeção de Dependência manual (sem frameworks)</li>
        <li>Estrutura pronta para evoluções futuras (como Strategy Pattern)</li>
    </ul>
    <h2>Regras Funcionais:</h2>
    <p>O sistema seguirá o seguinte fluxo ao gerar qualquer relatório:</p>
    <table border="1">
        <tr>
            <th>Etapa</th>
            <th>Descrição</th>
            <th>Obrigatório?</th>
            <th>Personalizável?</th>
        </tr>
        <tr>
            <td>1</td>
            <td>Buscar os dados do usuário</td>
            <td>Sim</td>
            <td>Sim</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Processar os dados</td>
            <td>Sim</td>
            <td>Sim</td>
        </tr>
        <tr>
            <td>3</td>
            <td>Adicionar informações extras (Hook)</td>
            <td>Não</td>
            <td>Sim</td>
        </tr>
        <tr>
            <td>4</td>
            <td>Exportar os dados (PDF ou console)</td>
            <td>Sim</td>
            <td>Sim</td>
        </tr>
        <tr>
            <td>5</td>
            <td>Enviar o relatório por e-mail (Hook)</td>
            <td>Não</td>
            <td>Sim</td>
        </tr>
    </table>
    <h2>Tipos de Relatórios:</h2>
    <table border="1">
        <tr>
            <th>Tipo</th>
            <th>Informações Extras</th>
            <th>Exportação</th>
            <th>Envio de E-mail</th>
        </tr>
        <tr>
            <td>Cliente</td>
            <td>Informações de compras</td>
            <td>Console</td>
            <td>Envia e-mail com ofertas</td>
        </tr>
        <tr>
            <td>Funcionário</td>
            <td>Dados de produtividade</td>
            <td>Console</td>
            <td>Não envia</td>
        </tr>
        <tr>
            <td>Administrador</td>
            <td>Dados globais da empresa</td>
            <td>PDF</td>
            <td>Não envia</td>
        </tr>
    </table>
    <h2>Etapas Detalhadas:</h2>
    <h3>Etapa 1 - Estrutura Base (Template Method)</h3>
    <p><strong>Objetivo:</strong> Implementar o fluxo básico usando Template Method Pattern, com os Hooks vazios.</p>
    <p><strong>Tarefas:</strong></p>
    <ul>
        <li>Criar a classe abstrata RelatorioUsuario com o método final gerarRelatorio().</li>
        <li>Definir métodos protegidos para cada etapa.</li>
        <li>Criar os hooks: adicionarInformacoesExtras() e enviarPorEmail().</li>
        <li>Criar as subclasses: RelatorioCliente, RelatorioFuncionario, RelatorioAdministrador.</li>
    </ul>
    <p><strong>Critérios de sucesso:</strong> Fluxo executando na ordem certa. Subclasses só sobrescrevendo o necessário.</p>
    <h3>Etapa 2 - Inclusão do Null Object Pattern (Envio de E-mail)</h3>
    <p><strong>Objetivo:</strong> Eliminar a necessidade de verificações null no envio de e-mail.</p>
    <p><strong>Tarefas:</strong></p>
    <ul>
        <li>Criar a interface EmailService.</li>
        <li>Criar RealEmailService (simula envio com um print).</li>
        <li>Criar NullEmailService (não faz nada).</li>
        <li>Cada relatório sempre terá uma instância de EmailService.</li>
    </ul>
    <p><strong>Critérios de sucesso:</strong> Nunca usar null. Código limpo, sem if para verificar null.</p>
    <h3>Etapa 3 - Testes Unitários</h3>
    <p><strong>Objetivo:</strong> Garantir que cada relatório funciona isoladamente.</p>
    <p><strong>Tarefas:</strong></p>
    <ul>
        <li>Criar testes unitários para cada tipo de relatório.</li>
        <li>Testar a ordem das chamadas.</li>
        <li>Testar os hooks quando existirem.</li>
        <li>Testar que o NullEmailService realmente não executa nenhuma ação.</li>
    </ul>
    <p><strong>Critérios de sucesso:</strong> Testes rápidos e independentes. Cobertura dos fluxos principais.</p>
    <h3>Etapa 4 - Refatoração para SOLID (Princípios Gerais)</h3>
    <p><strong>Objetivo:</strong> Melhorar o design do código aplicando os princípios SOLID.</p>
    <p><strong>Tarefas:</strong></p>
    <ul>
        <li>Revisar cada classe para garantir responsabilidade única (SRP).</li>
        <li>Garantir abertura para extensão e fechamento para modificação (OCP).</li>
        <li>Diminuir acoplamento direto entre classes.</li>
    </ul>
    <p><strong>Critérios de sucesso:</strong> Código modular, coeso e preparado para mudanças futuras.</p>
    <h3>Etapa 5 - Injeção de Dependência Manual (Sem Spring)</h3>
    <p><strong>Objetivo:</strong> Garantir que as dependências sejam injetadas externamente.</p>
    <p><strong>Tarefas:</strong></p>
    <ul>
        <li>Parar de criar dependências internas com new.</li>
        <li>Fazer injeção via construtor para EmailService e outros componentes necessários.</li>
        <li>Criar uma classe Main ou AppConfig para montar os objetos manualmente.</li>
    </ul>
    <p><strong>Critérios de sucesso:</strong> Todas as dependências são recebidas via construtor. Código preparado para troca de implementações sem alteração interna.</p>
    <h3>Etapa 6 - Preparação para Strategy (Exportação)</h3>
    <p><strong>Objetivo:</strong> Isolar o comportamento de exportação de relatórios, preparando o código para o Strategy Pattern.</p>
    <p><strong>Tarefas:</strong></p>
    <ul>
        <li>Criar a interface Exportador com um método para exportar os dados.</li>
        <li>Criar implementações: ExportadorConsole e ExportadorPDF.</li>
        <li>Ajustar as subclasses de RelatorioUsuario para receber o Exportador por injeção.</li>
    </ul>
    <p><strong>Critérios de sucesso:</strong> Exportação totalmente desacoplada dos relatórios. Fácil de adicionar novos formatos no futuro.</p>
    <h2>Critérios Gerais de Avaliação:</h2>
    <ul>
        <li>Uso correto do Template Method.</li>
        <li>Implementação clara dos Hooks.</li>
        <li>Aplicação correta do Null Object Pattern.</li>
        <li>Qualidade dos testes unitários.</li>
        <li>Estrutura seguindo os princípios do SOLID.</li>
        <li>Injeção de dependências manual e bem organizada.</li>
    </ul>
    <p><strong>Observação:</strong> O exercício foi planejado para permitir um processo incremental, com commits claros a cada etapa. Durante a implementação, registre os erros, ajustes e aprendizados dentro do próprio repositório, nos commits ou nos PRs.</p>

<br>
<h3>Implementacao do exercicio::</h3>
<h3>Etapa 1 </h3>
<p>Para a etapa 1 foi criada a classe abstrata RelatorioUsuario, ou seja, essa classe nao pode ser instanciada e tem um metodo 
<strong>final</strong> gerarRelatorio, os metodos do tipo <strong>final</strong> nao podem ser sobreescritos pelas subclasses.</p>
<p>A classe RelatorioUsuario implementa o desgin pattern <strong>Template Method</strong> com o uso do metodo gerarRelatorio, esse metodo alem de 
<strong>final</strong> define uma sequencia de passos que a subclasse deve implementar, tambem possue metodos abstratos ou seja que as subclasses
sao obrigadas a reescrever e metodos que nao usam <strong>abstract</strong> ou seja nao sao obrigatorios de serem implementados pelas
subclasses e no nosso caso sao os <strong>Hooks methods</strong>metodos opcionais.</p>
<p>A classe RelatorioUsuario tem o atributo relatorio, que e do tipo StringBuilder, este sera usado para concatenar as mensagens e 
exibi-las ao final da execucao do metodo gerarRelatorio. Abaixo segue o codigo da classe RelatorioCliente da etapa 1 (os codigos podem sofrer alteracoes com o avanco do exercicio para as proximas etapas).</p>

``` Java

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



```

<p>Abaixo a classe RelatorioCliente, essa e uma calsse padrao Java que extende de RelatorioUsuario e implementa os metodos obirgatorios e tambem os dois <strong>Hook methods</strong>strong> pedidos no 
exercicio.</p>

``` Java

public class RelatorioCliente extends RelatorioUsuario {
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
        this.relatorio.append("Enviando email com ofertas\n");
    }
}



```

<p>E para finalizar a etapa 1 a classe main, para testes e craido um atributo do tipo Map com uma chave do tipo Integer e subclasses da RelatorioUsuario, aqui e usado um dos pilares da Orientacao a Objetos o
 Polimorfimos. Tambem destacar o uso de <strong>Reflexao/Generics</strong>, pois estamos em tempo de execucao instanciando uma classe no metodo executar. Segue abaixo a classe main inicial:</p>

 ``` Java

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final Map<Integer, Class<? extends RelatorioUsuario>> map = new HashMap<Integer, Class<? extends RelatorioUsuario>>();

        map.put(1, RelatorioCliente.class);
        map.put(2, RelatorioFuncionario.class);
        map.put(3, RelatorioAdministrador.class);

        executar(map.get(3));

    }

    public static <T extends RelatorioUsuario> void executar(Class<T> classe) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        RelatorioUsuario relatorio = classe.getConstructor().newInstance();
        relatorio.gerarRelatorio();
    }
}

```

<h3>Etapa 2 refatorando para incluir o design pattern Null Object Pattern (Envio de E-mail)</h3>
<p>Conforme proposto no exercicio o servico de envio de email, <strong>EmailService</strong>, pode receber valores null em algum dado momento. Assim e proposto a implementacao do padrao Null Object, a implemetnacao da etapa 2 para melhor arquitetura esta dentro do package email (isso pode ser refatorado com a evolucao do projeto e dos desafios propostos).</p>
<p>Junto com o  design pattern Null Object implementamos tambem o design pattern Factory (atraves da classe <strong>EmailFactory</strong>), este responsavel pela decisao de qual tipo de <strong>EmailService</strong> retornar. Caso EmailService seja null retorna um <strong>NullEmailService</strong>, caso nao seja null retorna <strong>RealEmailService</strong> dessa forma protegendo nossa aplicacao de retorno de execoes no EmailService. Abaixo segue a classe RealEmailService, essa e responsavel pelo envio do email, quando algum relatorio precisa enviar email.</p>

``` Java
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


```

<p>Abaixo temos a classe <strong>NullEmailService</strong> na qual o metodo <strong>enviarEmail</strong> retorna uma String vazia, dessa forma tratando possiveis erros.</p>

``` Java

package email;

public class NullEmailService implements EmailService{
    @Override
    public String enviarEmail(String remetente, String destinatario, String mensagem) {
        return "";
    }
}

```
<p>Na sequencia o codigo da interface EmailService e exibido, este e o contrato implementado tanto pela classe que deve enviar email como a classe que implementa
o padrao Null Object.</p>

``` Java
  package email;

public interface EmailService {

    String enviarEmail(String remetente, String destinatario, String mensagem);
}

```

<p>Na classe main foi definido uma bateria de testes com a classe <strong>EmailFactory</strong> e sem o padrao Factory. Com o exito na validacao dos testes o projeto 
segue para a Etapa 3.</p>

<h3>Etapa 3 - implementando Testes Unitários</h3>
<p>Os primeiros testes serao os testes de unidade. Testes de unidade sao testes em nivel de componente ou classe, o objetivo e testar um pedaco do codigo.</p> Ponto importante dos testes unitarios e que eles ajudam a identificar alteracoes no codigo fonte, que reflitam em comportamentos indesejados. Uma alta cobertura de teste do codigo permite o desenvolvimento de recursos sem a necessidade de realizar testes manuais. O ideal e sempre testar um comportamento por teste. 

<p>Iniciando os testes e visto a necessidade de refatorar o metodo enviarEmail, pois ate esta etapa os parametros estavam fixos, porem apra testes mais acertivos sera refatorado enviando dados para o meial de forma dinamica.</p>


</p>

<hr>



<h4>Referencias</h4>
<sub>
<p>Este repositorio e um estudo e implementacao do livro Design Patterns com Java, Projeto orientado a objetos guiado por padroes.</p>
  <p>O livro serve como um guia e implementacoes e pesquisas sao realizadas em conjunto com o estudo do livro, resultando em codigo proprios do proprietario deste repositorio.</p>
</sub>
