package com.chandu.repositories.fixedDeposit;

import com.chandu.model.FixedDepositDetails;

public interface FixedDepositDao {

    public FixedDepositDetails getFixedDepositDetails(long id);
    public boolean createFixedDeposit(FixedDepositDetails fdd);
}
