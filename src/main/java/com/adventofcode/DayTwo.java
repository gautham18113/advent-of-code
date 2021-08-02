package com.adventofcode;

public class DayTwo {
    public void calculate(String arr[]) {

        int count = 0;
        for (int i = 0; i < 1000; i++) {
            String policy_pwd = arr[i];

            String[] tmp = policy_pwd.split(":");

            String policy = tmp[0];
            String pwd = tmp[1];

            int min = Integer.valueOf(policy.split("-")[0]);
            int max = Integer.valueOf(policy.split("-")[1].split(" ")[0]);

            String target = String.valueOf(policy.split("-")[1].split(" ")[1]);

            int charcount = 0;

            for (int j = 0; j < pwd.length(); j++) {
                if (String.valueOf(pwd.charAt(j)).equals(target)) {
                    charcount++;
                }
            }

            if (charcount >= min && charcount <= max) {
                count++;
            }

        }
        System.out.println(count);
    }
}
