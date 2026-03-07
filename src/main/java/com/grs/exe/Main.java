package com.grs.exe;

import com.grs.exe.apply.listener.ContractEffectPojo;
import com.grs.exe.apply.listener.EffectContractEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        applicationContext.publishEvent(new EffectContractEvent(ContractEffectPojo.builder().contractId("HT123").build()));
    }
}
