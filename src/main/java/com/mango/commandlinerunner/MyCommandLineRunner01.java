package com.mango.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 凌风的MI
 */
@Component
@Order(100)
public class MyCommandLineRunner01 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("MyCommandLineRunner01>>>" + Arrays.toString(args));
    }
}
