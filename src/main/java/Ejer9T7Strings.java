import java.util.Scanner;

public class Ejer9T7Strings {
    public Ejer9T7Strings() {
        Scanner scan = new Scanner(System.in);
        String frase = "";

        System.out.println("Introduce una frase: ");
        frase = scan.nextLine();

        System.out.println(fraseImpares(frase));
    }


    public static StringBuilder fraseImpares(String frase) {
        StringBuilder palabra = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i)) && ((i + 1) % 2 == 0)) {
                palabra.append(frase.charAt(i));
            }
        }
        return palabra;
    }
}