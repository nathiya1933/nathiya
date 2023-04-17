import javax.swing.event.SwingPropertyChangeSupport;

/**
 * hello
 */
public class hello {
    private int n=30;
    class Inner{
        void msg(){
        System.out.println("data is " +n);
        
        }
    }

    public static void main(String args[]) {
        hello obj = new hello();
        hello.Inner in = obj.new Inner();
        in.msg();
    }
    
}

    
