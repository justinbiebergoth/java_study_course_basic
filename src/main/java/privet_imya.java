import java.util.Scanner;

public class privet_imya {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("напиши свое имя: ");
        String a = userInput.nextLine();
        userInput.close();

        System.out.println("привет, "+ a + "!");
    }
}
