package com.grs.exe.apply.listener;

import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContractEffectPojo {

    private String contractId;

    private XString status;
}
