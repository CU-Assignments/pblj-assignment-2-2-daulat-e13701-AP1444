import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("Sum of the list: " + sum);

        String numStr = "50";
        int parsedNum = Integer.parseInt(numStr); 
        System.out.println("Parsed number: " + parsedNum);
    }
}
