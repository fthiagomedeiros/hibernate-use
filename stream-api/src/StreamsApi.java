import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println(items);
        /*
         * [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
         */

        List<Integer> multiples = items.stream().map(StreamsApi::square).collect(Collectors.toList());
        System.out.println(multiples);
        /*
         * [1, 4, 9, 16, 25, 36, 49, 64, 81, 0]
         */

        List<Integer> greatThanEightValues = items.stream().map(x -> x * 3).filter(x -> x > 8).collect(Collectors.toList());
        System.out.println(greatThanEightValues);
        /*
         * [9, 12, 15, 18, 21, 24, 27]
         */

        List<Integer> itemsUnsorted = Arrays.asList(2,1,3,4,7,5,6,8,0,9);
        List<Integer> unsorted = itemsUnsorted.stream().map(x -> x * 2).sorted().collect(Collectors.toList());
        itemsUnsorted.stream().map(x -> x * 2).sorted().forEach(System.out::println);
        System.out.println(unsorted);
        /*
         * [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
         */

    }

    private static int square(int x) {
        return x * x;
    }

}
