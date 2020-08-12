
import java.util.Arrays;


public class change {
    public static void main(String[] args) {
        int[] azaza = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int a = 0; a < azaza.length; a++ ){
            if(azaza[a] == 1) azaza[a] = 0;
            else azaza[a] = 1;
        }
        System.out.println(Arrays.toString(azaza));
    }
}

class change2 {
    public static void main(String[] args) {
        int[] azaza1 = new int[8];
        int value = 0;
        for (int a = 0; a < azaza1.length; a++, value = value += 3){
            azaza1[a] = value;
        }
        System.out.println(Arrays.toString(azaza1));
    }
}
class change3 {
    public static void main(String[] args) {
        int[] nyan = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int desu = 0; desu < nyan.length; desu++) {
            if (nyan[desu] < 6) nyan[desu] = nyan[desu] * 2;
        }

        System.out.println(Arrays.toString(nyan));

    }
}

class change4 {
        public static void main(String[] args) {

            int[][] sugoi = new int[3][3];
            int firstEntry;
            int lastEntry;
            for (int baka = 0; baka < 3; baka++) {
                firstEntry = baka;
                lastEntry = sugoi[baka].length - (baka + 1);
                sugoi[baka][firstEntry] = 1;
                sugoi[baka][lastEntry] = 1;
            }

            for (int baka = 0; baka < sugoi.length; baka++) {
                for (int aho = 0; aho < sugoi.length; aho++) {
                    System.out.print(sugoi[baka][aho]);
                }
                System.out.println();
            }

        }
    }


class change5 {
    public static void main(String[] args) {

        int[] krya = new int[13];
        for (int kukareku = 0; kukareku < krya.length; kukareku++) {
            krya[kukareku] = (int)(Math.random()*100);

        }
        int min = Arrays.stream(krya).min().getAsInt();
        int max = Arrays.stream(krya).max().getAsInt();
        System.out.println(Arrays.toString(krya));
        System.out.println("min: "+ min);
        System.out.println("max: "+ max);
    }
}

class change6 {
    public static void main(String[] args) {
        int[] massivepta = new int[7];
        for (int peremennaya = 0; peremennaya < massivepta.length; peremennaya++) {
            massivepta[peremennaya] = (int) (Math.random() * 5);
        }

        int [] even = {10, 10};
        System.out.println(Arrays.toString(massivepta));
        System.out.println(checkBalance(massivepta));
        System.out.println(Arrays.toString(even));
        System.out.println(checkBalance(even));
    }

    public static boolean checkBalance(int[] massivepta) {
        int levaya = 0;
        int sum = 0;
        //
        for (int i=0; i < massivepta.length; i++) {
            levaya += massivepta[i];

            for (int y = i +1; y < massivepta.length; y++) {
                sum = sum + massivepta[y];
            }

            if (levaya == sum) {
                return true;
            }
        }

        return false;
    }
}

//Написать метод, которому на вход подается одномерный массив и число n (может быть положительным или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Нельзя пользоваться вспомогательными массивами.

class change7 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int jojo = 0; jojo < mass.length; jojo++) {
            mass[jojo] = (int)(Math.random() * 5);



        }
        System.out.println(Arrays.toString(mass));

    }
}