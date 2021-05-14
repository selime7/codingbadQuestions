package Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        //Given a list of integers, return a list where each integer is multiplied by 2.
        //doubling([1, 2, 3]) → [2, 4, 6]
        //doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
        //doubling([]) → []
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(doubling(nums));
    }
    public static List<Integer> doubling (List<Integer> nums) {
        return nums.stream().map(t->2*t).collect(Collectors.toList());

    }
}
