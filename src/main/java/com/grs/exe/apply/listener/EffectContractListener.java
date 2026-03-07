package com.grs.exe.apply.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EffectContractListener implements ApplicationListener<EffectContractEvent> {

    @Override
    public void onApplicationEvent(EffectContractEvent event) {

        ContractEffectPojo source = (ContractEffectPojo) event.getSource();
        String contractId = source.getContractId();
        log.info("合同：{}生效了", contractId);
    }
}
