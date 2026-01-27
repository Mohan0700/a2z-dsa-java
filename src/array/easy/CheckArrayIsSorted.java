package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//OPTIMAL APPROACH
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        if(size<=1){
            System.out.println("Array is sorted");
            return;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        for(int i=1;i<size;i++){
            if(list.get(i)<list.get(i-1)){
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}
