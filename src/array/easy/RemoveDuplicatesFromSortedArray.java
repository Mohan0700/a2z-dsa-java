package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//BRUTE APPROACH - Loop through the list and insert all elements in a sorted set . then loop through the set and
// insert all those elements in set to the list . return size of set .

public class RemoveDuplicatesFromSortedArray {
    //OPTIMAL APPROACH - 2 pointer
    public static int removeDuplicates(List<Integer> list){
        if(list.size()<2){
            return list.size();
        }
        int i=0;
        int j=1;
        while(j<list.size()){
            if(list.get(j)!=list.get(i)){
                list.set(++i,list.get(j));
            }
            j++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println(removeDuplicates(list));
        System.out.println(list);
    }
}
