import java.util.*;

public class Stm {
    public static void main(String[] args) {
        List<String> food = Arrays.asList("biriyani", "parota", "Dosa", "idly");
        Random random= new Random();
        random..limits(1);
        food.stream()
                .filter(n -> n.endsWith("a"))
                .forEach(System.out::println);

    }

}

