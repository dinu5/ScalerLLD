package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class FindStringLen {
    // find length of all the strings which starts with 'b'
    public static void main(String[] args) {
        List<String> list = Arrays.asList("brajeshwar","ayushee","dinobandhu","bubay");
        list.stream().filter(str->str.charAt(0)=='b').map(str->str.length()).forEach(System.out :: println);
        List<Integer> ansList = list.stream().filter(str->str.charAt(0)=='b').map(str->str.length()).collect(Collectors.toList());
        System.out.println(ansList);
    }
}
