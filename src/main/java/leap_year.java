import java.util.Scanner;

public class leap_year {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean leap = false;

            System.out.println("напиши год: ");
            int year = userInput.nextInt();
            userInput.close();


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else {
            leap = false;
        }
        if (leap == true)

            System.out.println(year + " - високосный год");
        else
            System.out.println(year + " - не високосный год");
    }
}





