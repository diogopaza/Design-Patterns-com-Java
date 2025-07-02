package strategy_passageiro;

public class Onibus implements Estrategia{

    @Override
    public String viagem() {
        return "viajando de onibus";
    }
}
