import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数字");
        while (true) {
        int guessNumber = sc.nextInt();
        if (guessNumber > number) {
            System.out.println("大了");
        } else if (guessNumber < number) {
            System.out.println("小了");
        } else {
            System.out.println("猜对了");
            break;
        }

    }

    }
}