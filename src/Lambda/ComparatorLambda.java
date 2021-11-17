package Lambda;
import java.util.*;

public class ComparatorLambda {

    public void compare(){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return  Integer.compare(o1.length(),o2.length());
            }
        };

        Comparator<String> comparator1 = (String o1, String o2) ->
                Integer.compare(o1.length(),o2.length());

        List<String> list = Arrays.asList("***","**","****","*");
        Collections.sort(list,comparator1);

        for(String s: list){
            System.out.println(s);
        }
    }
}
