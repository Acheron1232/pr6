package com.zxc;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int counter = 0;

    public void startCounting() {
        System.out.println("Старт лічильника...");
    }

    @Scheduled(fixedRate = 2000)
    public void incrementCounter() {
        if (counter < 10) {
            counter++;
            System.out.println("Лічильник: " + counter);
        } else {
            System.out.println("Лічильник досягнув 10, завершення.");
        }
    }

    public int getCounter() {
        return counter;
    }
}
