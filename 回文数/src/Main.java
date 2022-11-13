import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int x = sc.nextInt();
        int num = 0;
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            System.out.println(false);
        } else {
            while (x > num) {
                int ge = x % 10;
                x = x / 10;
                num = num * 10 + ge;
                if (x == num || x == num / 10) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }


    }
}











































