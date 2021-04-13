import com.chandu.service.fixedDeposit.FixedDespositServiceImpl;
import com.chandu.web.controller.FixedDepositController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChandraBank {

    private static Logger logger = LogManager.getLogger(FixedDespositServiceImpl.class);
    public static void main(String args[])
    {


        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");

        FixedDepositController fixedDepositController =
                (FixedDepositController) context.getBean("fixedDepositController");

        logger.info("fixed deposit controller submit info "+fixedDepositController.submit());

        logger.info("fixedDepositController get info "+fixedDepositController.get());


    }

}
