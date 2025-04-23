# Design-Patterns-com-Java

<h3>Orientação a Objetos - Noções</h3>
<p>
  <strong>Revisando modificadores de metodos</strong><br/>
  <ul>
    <li>abstract: somente pode ser usado em classes abstratas no Java, esse tipo de metodo nao contem um corpo, ou seja, nao tem uma implementacao. Metodos abstratos obrigam subclasses a implementa-los, atraves da sobreescrita de metodos (um dos usos de Polimorfismo - <emph>overriding</emph>).</li>
    <li>final: metodos final nao podem ser sobreescritos por subclasses, isso garante que o comportamento no metodo nao sera alterado.</li>
    <li>private: metodos private sao acessiveis apenas pela propria classa (principio da OO de Encapsulamento).</li>
    <li>protected ou public: metodos public sao acessiveis por qualquer classe e metodos protected sao acessiveis pelas subclasses no mesmo pacote e nas subclasses (heranca), mesmo que estejam em outros pacotes..</li>
  </ul>

  
</p>


<h3>Strategy</h3>
<p>Objetivo: encapsular um algoritmo dentro de uma classe.</p>
<p>O padrao Strategy necessita de diversas variacoes de um algoritmo. </p>
<p>Exercicio: Implemente o padrao Strategy onde um passageiro possa definir uma das tres formas de viagem: carro, onibus ou aviao:</p>

<h3>Null Object</h3>
<p>Este padrao ilustra como com o uso de heranca e possivel enganar o codigo que utiliza a classe, introduzindo um novo comportamento que ira eliminar a necessidade do uso de condicionais. </p>
<p>O padrao Null Object propoe a criacao de uma classe para representar objetos nulos em uma aplicacao. Essa classe deve estender (tambem e possivel usar interfaces) a classe original e implementar seus metodos de forma a executar o comportamento esperado da aplicacao quando um valor nulo for recebido. Dessa forma, em vez de retornar um valor nulo, retorna-se uma istancia dessa nova classe.</p>

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
<p><strong>Exercício Avançado de Template Method - Sistema de Geração de Relatórios : Resolucao no projeto template-method-exercicio-avancado</strong><br><p>
  <p>🎯 <strong>Objetivo:</strong><br>
Criar um sistema que gere relatórios para diferentes tipos de usuários (Clientes, Funcionários, Administradores), seguindo um fluxo fixo, mas com partes variáveis e opcionais, usando Template Method e Hook Methods.</p>

<h4>📄 Regras do Exercício</h4>
<ol>
  <li>
    Crie uma classe abstrata chamada <code>RelatorioUsuario</code> com o método <code>gerarRelatorio()</code>:<br>
    Este será o template method final, e deve executar os seguintes passos:
    <ul>
      <li>Buscar os dados do usuário (obrigatório).</li>
      <li>Processar os dados (obrigatório).</li>
      <li>Adicionar informações extras (hook opcional).</li>
      <li>Exportar os dados para PDF ou console (obrigatório).</li>
      <li>Enviar o relatório por e-mail (hook opcional).</li>
    </ul>
    Cada passo deverá ser um método protegido, e os métodos 3 e 5 serão hook methods (padrão: não fazem nada).
  </li>
  <li>
    Crie subclasses para:
    <ul>
      <li><strong>RelatorioCliente</strong>: inclui informações de compras e envia e-mail com ofertas.</li>
      <li><strong>RelatorioFuncionario</strong>: inclui dados de produtividade e não envia e-mail.</li>
      <li><strong>RelatorioAdministrador</strong>: inclui dados globais da empresa e não possui informações extras, mas exporta para PDF.</li>
    </ul>
  </li>
</ol>

<h4>📈 Expectativa para Refatoração Futuramente</h4>
<p>
Você vai perceber que exportar para PDF ou console vai precisar variar. Isso pode ser refatorado com Strategy para isolar esse comportamento.<br>
Os hooks poderão crescer e virar comportamentos injetáveis, o que pode levar você a considerar injeção de dependência manual (sem Spring).<br>
O envio de e-mail pode virar uma interface de serviço externa (SMTP, logs...).
</p>

<h4>✅ Critérios de Avaliação</h4>
<ul>
  <li>Correto uso do Template Method.</li>
  <li>Clareza entre métodos obrigatórios e hooks opcionais.</li>
  <li>Clareza de responsabilidades em cada classe filha.</li>
  <li>Estrutura que permita crescer e mudar sem quebrar o modelo base.</li>
</ul>
  
</p>


<h4>Referencias</h4>
<sub>
<p>Este repositorio e um estudo e implementacao do livro Design Patterns com Java, Projeto orientado a objetos guiado por padroes.</p>
  <p>O livro serve como um guia e implementacoes e pesquisas sao realizadas em conjunto com o estudo do livro, resultando em codigo proprios do proprietario deste repositorio.</p>
</sub>
