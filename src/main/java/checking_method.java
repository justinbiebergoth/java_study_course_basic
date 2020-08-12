public class checking_method {

    public static boolean checkin_check(int a, int b) {
        int no_one_line = a + b;
        return (no_one_line >= 10 && no_one_line <= 20);
    }


    public static void main(String[] args) {

        System.out.println(checkin_check(0, 7));
    }

}
