package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        if(size==0){
            System.out.println("There is no elements in the array");
            return;
        }
        int maximum = 0;
        for(int i=1;i<size;i++){
            if(list.get(i)>list.get(maximum)){
                maximum=i;
            }
        }
        System.out.println("Largest Element in Array is " + list.get(maximum) +" at index " + maximum);
    }
}
