package basics.Maths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        if(num<0 || num==0 || num==1){
            System.out.println("Not a Prime Number");
            System.exit(0);
        }

        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                System.out.println("Not a prime Number");
                System.exit(0);
            }
        }
        System.out.println("Prime Number");
    }
}
