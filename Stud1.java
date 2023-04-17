import java.util.*;
public class Stud1 {
    public static void main(String[] args) {
        ArrayList<Stud> n= new ArrayList<Stud>();
        n.add(new Stud(81, 31433,"nathii"));
        n.add(new Stud (3,31890,"keerthiiiii"));
        n.add(new Stud (20,31555,"madhuuuuu"));

        Collections.sort(n);
        for(Stud st:n)
        System.out.println(st.age+" "+st.id+" "+st.name);
        
    }
    
}
