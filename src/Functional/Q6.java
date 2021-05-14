package Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q6 {

    public static void main(String[] args) {

        //Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
        //math1([1, 2, 3]) → [20, 30, 40]
        //math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
        //math1([10]) → [110]
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(math1(nums));
    }
    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(t->(t+1)*10).collect(Collectors.toList());
    }
}
