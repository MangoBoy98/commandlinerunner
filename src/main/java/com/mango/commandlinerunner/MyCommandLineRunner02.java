package com.mango.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

/**
 * @author 凌风的MI
 */
@Component
@Order(99)
public class MyCommandLineRunner02 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("MyCommandLineRunner02>>>" + Arrays.toString(args));
    }
}
