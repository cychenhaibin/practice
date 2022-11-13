import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            int number = sc.nextInt();
            int i;
            for(i=1;i<=number;i++){
                  if(i*i==number){
                      System.out.println(i+"就是"+number+"平方根");
                      break;
                  }else if(i*i>number){
                        System.out.println((i-1)+"就是"+number+"平方根的整数部分");
                        break;
                  }
            }
      }
}