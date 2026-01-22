package basics.Maths;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

//        int limit = Math.min(num1,num2);
        int hcf=1;
//        for(int i=2; i<=limit; i++){
//            if(num1%i==0 && num2%i==0){
//                hcf=i;
//            }
//        }
        int n1 = num1;
        int n2=num2;
        while(n1!=0 && n2!=0){
            if(n1>=n2)
                n1%=n2;
            else
                n2%=n1;
        }

        if(n1==0)
            hcf=n2;
        else
            hcf=n1;

        int lcm = (num1*num2)/hcf;

        System.out.println("HCF is "+hcf + " and LCM is "+lcm);
    }
}
