package Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {

        //Given a list of strings, return a list where each string has "y" added at its start and end.
        //moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
        //moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
        //moreY(["yay"]) → ["yyayy"]
        List<String>strings=new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(moreY(strings));
    }
    public static List<String> moreY(List<String> strings) {
        return strings.stream().map(t->"y"+t+"y").collect(Collectors.toList());
    }

}
