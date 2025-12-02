import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {

        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        
        Map<Integer, Integer> result = new LinkedHashMap<>();

        
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        
        for (int num : arr) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    result.put(divisor, result.get(divisor) + 1);
                }
            }
        }

        
        System.out.println(result);
    }
}
