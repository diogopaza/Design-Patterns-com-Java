package strategy_passageiro;

public class Passageiro {

    private String nome;
    private int idade;
    private Estrategia estrategia;

    public String viajar() {
        return """
                O passageiro %s com idade de %s
                está %s
                """.formatted(nome, idade, estrategia.viagem());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}
