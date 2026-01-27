package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.swap;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        if(size<=1){
            return;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        moveZeroes(list);
        System.out.println(list);
    }
    //Brute force ->We can first loop the array count the number of zeroes . Then create a new list add all the
    //non-zero elements in the new array . Post that we can copy the elements from new array to the previous array
    //and then add the remaining places with zeroes .

    //Optimal Approach ->
    private static void moveZeroes(List<Integer> list) {
        int i=0;
        int j=0;
        while(j<list.size()){
            if(list.get(j)!=0){
                swap(list,i,j);
                i++;
            }
            j++;
        }
    }
}
