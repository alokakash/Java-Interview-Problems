
import java.util.Arrays;
import java.util.List;

public class FindSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Sum of numbers using Stream API
        int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Converts stream to IntStream
                .sum();
        System.out.println("Sum: " + sum); // Output: Sum: 15
        // Otherway to write this¸
        System.out.println("Sum: " + numbers.stream().reduce(0, (total, num) -> total + num)); // Output: Sum: 15
        System.out.println("Sum: " + numbers.stream().reduce(0, Integer::sum)); // Output: Sum: 15
    }
}