package strategy_formatador_texto;

import java.util.List;

public class main {
    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();

        editor.setFormatador(new FormatadorMaiusculo());
        System.out.println(editor.processar("ola mundo")); // OLA MUNDO

        editor.setFormatador(new FormatadorMinusculo());
        System.out.println(editor.processar("OLA MUNDO")); // ola mundo

        editor.setFormatador(new FormatadorCapitalizado());
        System.out.println(editor.processar("ola mundo")); // Ola mundo

        List<String> nomes = List.of("Joao", "Beto", "Ademir");
        nomes.forEach(nome -> System.out.println(nome));

    }




}
