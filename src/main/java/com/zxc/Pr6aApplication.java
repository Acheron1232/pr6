package com.zxc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Pr6aApplication implements CommandLineRunner {
    @Autowired
    private CounterService counterService;

    @Autowired
    private TimeService timeService;
    public static void main(String[] args) {
        SpringApplication.run(Pr6aApplication.class, args);
    }

    @Override
    public void run(String... args) {
        counterService.startCounting();
    }
}
