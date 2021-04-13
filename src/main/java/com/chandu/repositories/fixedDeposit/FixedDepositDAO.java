package com.chandu.repositories.fixedDeposit;

import com.chandu.model.FixedDepositDetails;
import com.chandu.service.fixedDeposit.FixedDespositServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositDAO {
    private static Logger logger = LogManager.getLogger(FixedDepositDAO.class);

    FixedDepositDAO()
    {
        logger.info("created FixedDepositDAO");
    }

    public FixedDepositDetails getFixedDepositDetails(long id) {
        FixedDepositDetails fixedDepositDAO =
                new FixedDepositDetails(1234,1224,2,"chandu@du.com");
        return fixedDepositDAO;
    }

    public boolean createFixedDeposit(FixedDepositDetails fdd) {
        logger.info("FIxed deposit created sucessfully");
        return true;
    }
}
