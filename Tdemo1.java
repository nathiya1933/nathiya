public class Tdemo1 {
    public static void main(String[] args) {
        
        try {
            Tdemo.Divide(5, 0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Check your inputs ");
        }
    }
    
}