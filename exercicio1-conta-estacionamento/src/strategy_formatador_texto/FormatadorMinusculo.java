package strategy_formatador_texto;

public class FormatadorMinusculo implements FormatadorTexto {
    @Override
    public String processar(String texto) {
        return texto.toLowerCase();
    }
}

