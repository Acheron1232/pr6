package com.zxc;

import com.zxc.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service

public class TimeService {

    private final CounterService counterService;

    public TimeService(CounterService counterService) {
        this.counterService = counterService;
    }

    @Scheduled(fixedRate = 5000)
    public void printCurrentTime() {
        if (counterService.getCounter() >= 10) {
            System.out.println("Умова зупинки виконана, завершення задач.");
            return;
        }

        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("Поточний час: " + time);
    }
}
