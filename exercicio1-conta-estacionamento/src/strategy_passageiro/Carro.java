package strategy_passageiro;

public class Carro implements Estrategia {


    @Override
    public String viagem() {
        return "viajando de carro";
    }
}
