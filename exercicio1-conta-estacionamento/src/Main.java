//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //simulando algumas horas atras
        long agoraMillis = System.currentTimeMillis();
        long duasHorasAtrasMillis = agoraMillis - (2 * 60 * 60 * 1000);

        var contaEstacionamento = new ContaEstacionameto();
        contaEstacionamento.setVeiculo(new Passeio());
        contaEstacionamento.setInicio(duasHorasAtrasMillis);

        System.out.println("Valor a pagar pelo estacionamento:");
        System.out.println(String.format("R$ %s", contaEstacionamento.valorConta()));


    }
}