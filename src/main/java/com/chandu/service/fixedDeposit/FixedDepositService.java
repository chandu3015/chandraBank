package com.chandu.service.fixedDeposit;

import com.chandu.model.FixedDepositDetails;

public interface FixedDepositService {
    FixedDepositDetails getFixedDepositDetails(long l);

    boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails);
}
