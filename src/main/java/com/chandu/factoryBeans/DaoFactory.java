package com.chandu.factoryBeans;

import com.chandu.repositories.fixedDeposit.FixedDepositDao;
import com.chandu.repositories.fixedDeposit.FixedDepositHibernateDAO;
import com.chandu.repositories.fixedDeposit.FixedDepositJdbcDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoFactory {
    private static Logger logger = LogManager.getLogger(DaoFactory.class);

    public static FixedDepositDao getFixedDepositDAO(String beanType)
    {
        FixedDepositDao fixedDepositDao = null;

        switch(beanType)
        {
            case "JDBC":
                fixedDepositDao = new FixedDepositJdbcDAO();
               logger.info("created JDBC DAO object");
                break;
            case "Hibernate":
                fixedDepositDao = new FixedDepositHibernateDAO("hibernate config");
                logger.info("created Hibernate DAO object");
                break;
            default:
               logger.error("unable to create DAO object. Please use either JDBC or Hibernate");
               break;
        }

        return fixedDepositDao;

    }
}
