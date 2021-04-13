package com.chandu.repositories.fixedDeposit;

import com.chandu.model.FixedDepositDetails;
import com.chandu.web.controller.FixedDepositController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositHibernateDAO implements  FixedDepositDao{
    private static Logger logger = LogManager.getLogger(FixedDepositHibernateDAO.class);
    private String hibernateDetails;

    public FixedDepositHibernateDAO(String hibernateDetails) {
        this.hibernateDetails = hibernateDetails;
    }


    @Override
    public FixedDepositDetails getFixedDepositDetails(long id) {
        return null;
    }

    @Override
    public boolean createFixedDeposit(FixedDepositDetails fdd) {
        return false;
    }
}
