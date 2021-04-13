package com.chandu.service.personalBanking;

import com.chandu.service.email.EmailMessageSender;
import com.chandu.service.jms.JmsMessageSender;
import com.chandu.service.webservice.WebServiceInvoker;

public class PersonalBankingServiceImpl implements PersonalBankingService{


    private JmsMessageSender jmsMessageSender;
    private EmailMessageSender emailMessageSender;

    public void setWebServiceInvoker(WebServiceInvoker webServiceInvoker) {
        this.webServiceInvoker = webServiceInvoker;
    }

    private WebServiceInvoker webServiceInvoker;

    public PersonalBankingServiceImpl(JmsMessageSender jmsMessageSender, EmailMessageSender emailMessageSender) {
        this.jmsMessageSender = jmsMessageSender;
        this.emailMessageSender = emailMessageSender;
    }




}
