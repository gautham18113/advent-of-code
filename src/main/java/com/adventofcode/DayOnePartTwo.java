package com.adventofcode;

import java.util.HashMap;
import java.util.Map;

public class DayOnePartTwo {

    public int calculate(int[] arr) {
        int target = 2020;

        for (int i = 0; i < arr.length; i++) {
            int currentTarget = target - arr[i];

            Map<Integer, Integer> threeSum = new HashMap<Integer, Integer>();

            for (int j = i + 1; j < arr.length; j++) {
                if (threeSum.containsKey(currentTarget - arr[j])) {
                    System.out.println(arr[threeSum.get(currentTarget - arr[j])]);
                    System.out.println(arr[j]);
                    System.out.println(arr[i]);

                    return arr[threeSum.get(currentTarget - arr[j])] * arr[j] * arr[i];
                }

                threeSum.put(arr[j], j);
            }
        }

        return 0;
    }
}
