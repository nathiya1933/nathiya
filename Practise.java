import java.util.*;
public class Practise {
    public static void main(String[] args) {
        List<Integer> T = new ArrayList<Integer>() ;
        List<Integer> T1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            T.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
             T1.add(sc.nextInt());
        }
        //System.out.println(T);
        //System.out.println(T1);
        T.add(3,3);
        System.out.println(T);
        T.remove(1);
        System.out.println(T);
        T.addAll(T1);
        System.out.println(T);
        T.retainAll(T1);
        System.out.println(T);


        
    }
    
}
