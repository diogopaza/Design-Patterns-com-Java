package strategy_formatador_texto;

public class FormatadorCapitalizado implements FormatadorTexto {
    @Override
    public String processar(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}
