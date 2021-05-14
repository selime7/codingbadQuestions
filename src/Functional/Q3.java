package Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        //Given a list of strings, return a list where each string has "*" added at its end.
        //addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
        //addStar(["hello", "there"]) → ["hello*", "there*"]
        //addStar(["*"]) → ["**"]
        List<String>nums=new ArrayList<>();
        nums.add("a");
        nums.add("bb");
        nums.add("ccc");
        System.out.println(addStar(nums));
    }
    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(t->t+"*").collect(Collectors.toList());
    }

}
