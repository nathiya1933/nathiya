 import java.util.*;
 public class Array2 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        List<String> list = new ArrayList<>();
        List<String> li = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        }
        for(int i=0;i<n;i++)
        {
            if(list.get(i).contains("a")|| list.get(i).contains("e") || list.get(i).contains("i") || list.get(i).contains("o")|| list.get(i).contains("u"))
            {
                li.add(list.get(i));
            }
        }
        Collections.sort(li);
        System.out.print(li.toString());

    }
    

}
