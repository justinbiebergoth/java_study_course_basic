import java.util.Scanner;

class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner userInput = new Scanner(System.in);

        System.out.println("вычислю выражение a * (b + (c / d)) без смс и регистрации! ");

        System.out.println("введи a: ");
        float a = userInput.nextFloat();

        System.out.println("введи b, сука: ");
        float b = userInput.nextFloat();


        System.out.println("отлично, введи c: ");
        float c = userInput.nextFloat();


        System.out.println("и последний рывочек, введи d: ");
        float d = userInput.nextFloat();
        userInput.close();


        float result = a * (b + (c / d));
        System.out.print("молодец, смог ввести цифры. твой ответ: " + result);



    }
}
