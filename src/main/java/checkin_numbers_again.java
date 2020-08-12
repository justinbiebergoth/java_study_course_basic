import java.util.Scanner;
public class checkin_numbers_again {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("напиши число, которое хочешь проверить: ");
        int a = userInput.nextInt();
        userInput.close();

        if(a >= 0){
            System.out.println(a + " - это число положительное ");
        } else {
            System.out.println(a + " - это число отрицательное ");
        }

    }

}
