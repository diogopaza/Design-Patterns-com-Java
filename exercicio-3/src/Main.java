import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int cont = 0;
        while (cont < 3) {
            input = cont == 0 ? scanner.nextLine() : input + " " + scanner.nextLine();
            cont++;
        }
        String[] partes = input.split(" ");
        System.out.println("================================");
        for (int i = 0; i < 6; ) {
            int espaco = 15 - partes[i].length();
            System.out.printf("%-" + 15 + "s %03d%n"
                    , partes[i], Integer.parseInt(partes[i + 1]));
            i = i + 2;
        }
        System.out.println("================================");
    }
}