package Functional;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {
        //Given a list of strings, return a list where each string has all its "x" removed.
        //noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
        //noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
        //noX(["x"]) → [""]
        List<String>strings=new ArrayList<>();
        strings.add("xxax");
        strings.add( "xbxbx");
        strings.add("xxcx");
        System.out.println(noX(strings));
    }
    public static List<String> noX(List<String> strings) {
        return strings.stream().map(t -> t.replaceAll("x", "")).collect(Collectors.toList());
    }
}
