package Activities;

import java.util.Arrays;

public class Activity4 {


    public static void ascendingSort(int array[]){
         int size = array.length, a;
        
        for (a = 1; a < size; a++) {
            int key = array[a];
            int b = a - 1;
            
            while (b >= 0 && key < array[b]) {
                array[b + 1] = array[b];
                --b;
            }
            array[b + 1] = key;
        }
    }
   
    
    public static void main(String args[]) {
        int[] data = { 8, 5, 2, 6, 3 };
        System.out.println("Before Sorted Array in Unorder:");
        System.out.println(Arrays.toString(data));
        ascendingSort(data);
        System.out.println("After Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
    




