package com.chandu.web.controller;


import com.chandu.model.FixedDepositDetails;
import com.chandu.service.fixedDeposit.FixedDepositService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositController {
    private FixedDepositService fixedDepositService;
    private static Logger logger = LogManager.getLogger(FixedDepositController.class);

    public FixedDepositController(){
        logger.info("fixedDepositController got created");
    }

    public void setFixedDepositService(FixedDepositService fixedDepositService) {

        this.fixedDepositService = fixedDepositService;
        logger.info("fixedDepositController got fixedDepositService dependency");
}

    public boolean submit() {
        return fixedDepositService.createFixedDeposit(new FixedDepositDetails(
                1, 10000, 365, "someemail@something.com"));
    }

    public FixedDepositDetails get() {
        return fixedDepositService.getFixedDepositDetails(1L);
    }
}
