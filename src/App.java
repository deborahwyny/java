import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("helloo");


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);

        int firstNumber = numbers.get(0);
        if(firstNumber % 2 == 0){
            System.out.println("Ele é par");
        } else {
            System.out.println("Ele é impar");
        }
///////////teste
    }
}
