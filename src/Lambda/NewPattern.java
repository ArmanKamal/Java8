package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NewPattern {

    public void newPatternExample(){
        List<String> stringList = Arrays.asList("one","two","three","four","five");

        List<String> result = new ArrayList<>();


        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = s -> result.add(s);

        stringList.forEach(c1.andThen(c2));
        System.out.println(result);






    }
}
