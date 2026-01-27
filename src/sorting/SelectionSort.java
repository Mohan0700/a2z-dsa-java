package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<size;i++){
            int mini = i;
            for(int j=i+1;j<size;j++){
                if(list.get(j)<list.get(mini))
                    mini=j;
            }
            int temp = list.get(mini);
            list.set(mini, list.get(i));
            list.set(i,temp);
        }
        for(Integer x:list){
            System.out.print(x + " ");
        }
    }

}
