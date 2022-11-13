import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= number-1; i++) {
            if(number%i==0){
                flag = false;
                //System.out.println(number+"不是一个质数");
                break;
            }

        }
        if(flag){
            System.out.println(number+"是一个质数");
        }else{
            System.out.println(number+"不是一个质数");
        }
    }
}