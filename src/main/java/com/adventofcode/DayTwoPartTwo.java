
package com.adventofcode;

public class DayTwoPartTwo {
    public void calculate(String arr[]) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String policy_pwd = arr[i];

            String[] tmp = policy_pwd.split(":");

            String policy = tmp[0];
            String pwd = tmp[1];

            int min = Integer.valueOf(policy.split("-")[0]);
            int max = Integer.valueOf(policy.split("-")[1].split(" ")[0]);

            String target = String.valueOf(policy.split("-")[1].split(" ")[1]);

            boolean firstIsEqual = String.valueOf(pwd.charAt(min)).equals(target);
            boolean secondIsEqual = String.valueOf(pwd.charAt(max)).equals(target);

            if (!(firstIsEqual && secondIsEqual) && (firstIsEqual || secondIsEqual)) {
                count++;
            }

        }
        System.out.println(count);
    }
}
