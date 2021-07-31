package com.adventofcode;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import com.adventofcode.AppTest;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AppTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
