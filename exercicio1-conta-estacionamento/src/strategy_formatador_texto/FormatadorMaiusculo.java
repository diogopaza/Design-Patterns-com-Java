package strategy_formatador_texto;

public class FormatadorMaiusculo implements FormatadorTexto, Teste{
    @Override
    public String processar(String texto) {
        return texto.toUpperCase();
    }

    @Override
    public String teste() {
        return "";
    }
}
