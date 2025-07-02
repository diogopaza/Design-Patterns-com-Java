package strategy_formatador_texto;

public class EditorTexto {

    private FormatadorTexto formatador;

    public void setFormatador(FormatadorTexto formatadorTexto) {
        this.formatador = formatadorTexto;
    }

    public String processar(String texto) {
        return formatador.processar(texto);
    }


}
