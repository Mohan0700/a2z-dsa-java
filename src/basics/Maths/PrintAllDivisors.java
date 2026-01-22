package basics.Maths;

import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        if(num<0){
            System.out.println("Negative number");
            System.exit(0);
        }
        if(num==0){
            System.out.println("No Divisors");
            System.exit(0);
        }

//        for(int i=1;i<=num;i++){
//            if(num%i==0)
//                System.out.print(i + " ");
//        }

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.print(i + " ");
                if(i!=(num/i)){
                    System.out.print(num/i + " ");
                }
            }

        }
    }
}
