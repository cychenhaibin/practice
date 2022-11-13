import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int count = 0;
        while(dividend>=divisor){
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("余数为："+dividend);
        System.out.println("商为："+count);


        /*Scanner sc = new Scanner(System.in);
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
                }
            }
        }

         */
    }
}


