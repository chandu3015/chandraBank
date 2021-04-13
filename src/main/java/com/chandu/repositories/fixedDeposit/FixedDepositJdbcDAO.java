package com.chandu.repositories.fixedDeposit;

import com.chandu.model.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositJdbcDAO  implements  FixedDepositDao{
    private static Logger logger = LogManager.getLogger(FixedDepositJdbcDAO.class);
    private String JDBCdetails;

    public void setJDBCdetails(String JDBCdetails) {
        this.JDBCdetails = JDBCdetails;
    }

    @Override
    public FixedDepositDetails getFixedDepositDetails(long id) {
        return new FixedDepositDetails(1,2l,3,"a@afs.com");

    }

    @Override
    public boolean createFixedDeposit(FixedDepositDetails fdd) {
        return false;
    }
}
