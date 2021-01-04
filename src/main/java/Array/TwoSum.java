package main.java.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    private static int[] twoSum(int[]arr,int target)
    {

        int[]twoSum = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            if(!map.containsKey(target-arr[i]))
            {
                map.put(arr[i],i);
            }
            else
            {
                arr[1] = i;
                arr[0] = map.get(target-arr[i]);
                return twoSum;
            }
        }
        return twoSum;
    }

    public static void main(String[] args) {
        int[]arr = {2,11,5,10,7,8};
        int[] ints = twoSum(arr, 9);
        System.out.println("two sum numbers are "+ints[0]+" "+ints[1]);
    }
}
