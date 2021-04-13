package com.chandu.service.fixedDeposit;

import com.chandu.model.FixedDepositDetails;
import com.chandu.repositories.fixedDeposit.FixedDepositDAO;

import com.chandu.web.controller.FixedDepositController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FixedDespositServiceImpl implements  FixedDepositService{
    private FixedDepositDAO fixedDepositDAO;

    private static Logger logger = LogManager.getLogger(FixedDespositServiceImpl.class);

    public FixedDespositServiceImpl(FixedDepositDAO fixedDepositDAO)
    {
        this.fixedDepositDAO = fixedDepositDAO;
        logger.info("creating FixedDespositServiceImpl");
    }


    @Override
    public FixedDepositDetails getFixedDepositDetails(long l) {
        return fixedDepositDAO.getFixedDepositDetails(l);
    }

    public boolean createFixedDeposit(FixedDepositDetails fdd) {
        return fixedDepositDAO.createFixedDeposit(fdd);
    }
}
