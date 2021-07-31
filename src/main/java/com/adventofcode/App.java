package com.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.adventofcode.Day1;
import java.io.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        dayOne();
    }

    public static void dayOne() {
        try {
            System.out.println(new File(".").getAbsolutePath());
            File file = new File("/Users/gautham/projects/advent-of-code/src/main/java/com/adventofcode/Day1.txt");

            Scanner sc = new Scanner(file);

            int[] arr = new int[250];

            int i = 0;

            while (sc.hasNextInt()) {
                arr[i++] = sc.nextInt();
            }

            Day1 d = new Day1();

            // int[] arr = { 1991, 20, 2000, 91, 9, 20, 1992 };

            int[] res = d.sum2020(arr);

            System.out.println(Arrays.toString(res));

            System.out.println(res[0] * res[1]);

        }

        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

    }
}
