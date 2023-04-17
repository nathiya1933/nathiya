import java.util.*;
import java.util.Scanner;
public class Array {
public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    int[] myArray= {1,2,3,4,5,6,7,8};
    for(int i=0;i<myArray.length;i++)
    {
       if(myArray[i]%2==0){
        a.add(myArray[i]);
       }
    }
   // System.out.println(a);
    Collections.sort(a);
    Collections.reverse(a);
    System.out.println(a);

    
}
}
