package Activities.Activities2;
import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args) {

       int[] arr = {10,77,10,54,-11,10};

       System.out.println("Orginial Arrays "+Arrays.toString(arr));

       int search = 10;
       int add = 30;

       System.out.println("Result "+ result(arr,search,add));


    }

     public static boolean result(int[] numbers, int search, int add){

        int temp_add = 0;
        
        for (int number : numbers){
            if (number == search){
                temp_add += search;
            }

            if (temp_add > add){
                break;
            }

        }

            return temp_add == add;
        
     }
      
         
    
    }


