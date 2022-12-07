import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> divisorsOf52 = new ArrayList<>();
        Collections.addAll(divisorsOf52, 1, 2, 4, 13, 26, 52);
        List<Integer> randomNumbers = new ArrayList<>();
        Collections.addAll(randomNumbers, 1, 60, 13, 12);

        randomNumbers.addAll(divisorsOf52);
        System.out.println("Numbers: " + randomNumbers + " - Number of items: " + randomNumbers.size());

        int x = randomNumbers.indexOf(1);
        randomNumbers.remove(x);
        int y = randomNumbers.indexOf(13);
        randomNumbers.remove(y);

        System.out.println(randomNumbers);

        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println(randomNumbers);
    }
}
