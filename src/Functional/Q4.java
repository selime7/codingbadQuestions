package Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        //Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
        //copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
        //copies3(["24", "a", ""]) → ["242424", "aaa", ""]
        //copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
        List<String>nums=new ArrayList<>();
        nums.add("a");
        nums.add("bb");
        nums.add("ccc");
        System.out.println(copies3(nums));
    }
    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(t->t+t+t).collect(Collectors.toList());
    }
}
