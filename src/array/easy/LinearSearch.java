package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        if(size==0){
            System.out.println("No elements in Array");
            return;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        int key = sc.nextInt();
        System.out.println(search(list,key));
    }

    private static int search(List<Integer> list,int key){
        int index = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                index = i;
                break;
            }
        }
        return index;
    }
}
