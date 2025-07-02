package strategy_passageiro;

public class main {
    public static void main(String[] args) {
        System.out.println("VIAJANDO SISTEMAS");

        var passageiro = new Passageiro();
        passageiro.setNome("Pedro");
        passageiro.setIdade(11);
        passageiro.setEstrategia(new Onibus());

        System.out.println(passageiro.viajar());

    }
}
