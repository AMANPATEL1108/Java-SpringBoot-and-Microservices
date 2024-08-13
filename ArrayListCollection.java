import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCollection {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();

        nums.add(8);
        nums.add(5);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
