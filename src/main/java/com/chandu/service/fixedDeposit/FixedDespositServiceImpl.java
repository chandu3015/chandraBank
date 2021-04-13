package com.chandu.service.fixedDeposit;

import com.chandu.model.FixedDepositDetails;


import com.chandu.repositories.fixedDeposit.FixedDepositDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FixedDespositServiceImpl implements  FixedDepositService{
    private FixedDepositDao fixedDepositDAO;

    private static Logger logger = LogManager.getLogger(FixedDespositServiceImpl.class);

    public FixedDespositServiceImpl(FixedDepositDao fixedDepositDAO)
    {
        this.fixedDepositDAO = fixedDepositDAO;
        logger.info("creating FixedDespositServiceImpl");
        logger.info("adding dao dependency to  FixedDespositServiceImpl "+fixedDepositDAO);
    }


    @Override
    public FixedDepositDetails getFixedDepositDetails(long l) {
        return fixedDepositDAO.getFixedDepositDetails(l);
    }

    @Override
    public boolean createFixedDeposit(FixedDepositDetails fdd) {
        return fixedDepositDAO.createFixedDeposit(fdd);
    }
}
