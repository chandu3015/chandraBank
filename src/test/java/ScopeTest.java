import com.chandu.model.FixedDepositDetails;
import com.chandu.repositories.fixedDeposit.FixedDepositDao;
import com.chandu.web.controller.FixedDepositController;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class ScopeTest {
    private static ApplicationContext applicationContext ;

    @BeforeClass
    public static void iocInstance()
    {
        applicationContext =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
    }

    @Test
    public void testSingletonSameBean()
    {
        FixedDepositController fixedDepositController_A = (FixedDepositController) applicationContext.getBean("fixedDepositController");
        FixedDepositController fixedDepositController_B = (FixedDepositController) applicationContext.getBean("fixedDepositController");
        assertSame("Same fixedDepositController from same IOC ",fixedDepositController_A,fixedDepositController_B);
    }

    @Test
    public void testSingletonCreateType()
    {
        FixedDepositDao fixedDepositDao = (FixedDepositDao) applicationContext.getBean("fixedDepositDao");
        FixedDepositDao fixedDepositDao_B = (FixedDepositDao) applicationContext.getBean("fixedDepositDaoTest");
        assertNotSame("Different fixedDepositDao from same IOC ",fixedDepositDao,fixedDepositDao_B);
    }

    @Test
    public void protoTypeTest()
    {
        FixedDepositDetails fixedDepositDetails = (FixedDepositDetails) applicationContext.getBean("fixedDepositDetails");
        FixedDepositDetails fixedDepositDetails1 = (FixedDepositDetails) applicationContext.getBean("fixedDepositDetails");
        assertNotSame("Different fixedDepositDetails from same IOC as they are proto in scope",fixedDepositDetails,fixedDepositDetails1);
    }



}
