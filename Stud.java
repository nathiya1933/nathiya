import java.util.*;

class Stud implements Comparable<Stud>
 { 
    int age;
    int id;
    String name;
    Stud(int age, int id, String name){
    this.age= age;
    this.id= id;
    this.name= name;
    
}
public int compareTo(Stud st)
{
    if(age==st.age)
        return 0;
    else if(age>st.age)
    return 1;
    else 
    return -1;
}
 }