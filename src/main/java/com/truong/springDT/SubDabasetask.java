package com.truong.springDT;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SubDabasetask implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //Other db work
        System.out.println("other db works!!!");

    }
}
