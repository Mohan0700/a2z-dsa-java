package basics.Maths;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num<0){
            System.out.println("Negative number");
            System.exit(0);
        }
        if(num==0){
            System.out.println("Armstrong Number");
            System.exit(0);
        }

        int actualNum = num;
        int count = (int)(Math.log10(num)+1);
        int newNum = 0;

        while(num!=0){
            int rem = num%10;
            newNum += Math.pow(rem,count);
            num/=10;
        }

        if(newNum==actualNum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
