package com.grs.exe.apply.listener;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class EffectContractEvent extends ApplicationEvent {

    public EffectContractEvent(Object source) {
        super(source);
    }

    public EffectContractEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
