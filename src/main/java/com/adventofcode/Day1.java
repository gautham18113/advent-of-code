package com.adventofcode;

import java.util.HashMap;
import java.util.Map;

public class Day1 {

    int[] sum2020(int[] arr) {

        Map<Integer, Integer> twosum = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (twosum.containsKey(2020 - arr[i])) {
                int j = twosum.get(2020 - arr[i]);

                return new int[] { arr[i], arr[j] };
            }

            twosum.put(arr[i], i);
        }

        return new int[] { 0, 0 };

    }
}
