package com.grs.exe.apply.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractQueryController {

    @RequestMapping("/getContractInfo.json")
    @ResponseBody
    public String getContractInfo(String contractId) {
        return contractId;
    }
}
