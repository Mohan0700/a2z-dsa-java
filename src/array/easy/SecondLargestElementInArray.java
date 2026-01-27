package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

BRUTE -> Sort the array , and loop backwards starting from 2nd last element checking if the current element
is not equal to the next element . that means a[i] != a[i+1] ....if any where this condition comes true then a[i] is
the 2nd largest element . Come out of the loop .

*/

//OPTIMAL APPROACH

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        if(size<2){
            System.out.println("There is no 2nd largest element");
            return;
        }
        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(list.get(i)>maximum){
                secondMaximum = maximum;
                maximum=list.get(i);
            }
            else if(list.get(i)>secondMaximum && list.get(i)!=maximum){
                secondMaximum=list.get(i);
            }
        }
        if(secondMaximum==Integer.MIN_VALUE)
            System.out.println("There is no 2nd largest element");
        else
            System.out.println("Second Largest Element in Array is " + secondMaximum );
    }
}


