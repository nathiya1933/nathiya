import java.util.*;

public class Array1 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<String> a1 =new ArrayList<String>();
    List<String> a2 =new ArrayList<String>();
    for(int i=0;i<n;i++)
    {
        a1.add(sc.next());
    }
    //System.out.println(a1);
    for(String s:a1)
    {
       if(!a2.contains(s))
       {
        a2.add(s);
       }
    }
    Collections.sort(a2);
System.out.print(a2);
}
}
