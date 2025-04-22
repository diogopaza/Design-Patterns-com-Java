import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite Cliente ou Funcionario");
        var tipoCadastro = scanner.nextLine();
        if (tipoCadastro.equalsIgnoreCase("cliente")) {
            var usuario = new CadastroCliente();
            usuario.processarCadastro();
        } else if (tipoCadastro.equalsIgnoreCase("funcionario")) {
            var usuario = new CadastroFuncionario();
            usuario.processarCadastro();
        } else {
            System.out.println("Tipo de cadastro invalido");
        }
    }


}