package com.activemq.demo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SplitMessageTest {

    String message = "GZXFRTJ675FTRHJJJ87zyxtBig Kumar           U000000000000017.450EURATZAT";
    SplitMessage splitMessage = new SplitMessage(message);

    @DisplayName("Check for Message Length")
    @Test
    public  void checkMessage() {
        Assertions.assertEquals(splitMessage.inputString.length(),71);
    }

    @DisplayName("Check for TRN")
    @Test
    public  void checkTrn() {
        Assertions.assertEquals(splitMessage.inputMessage.getTrn().trim().length(),22);
    }


    @DisplayName("Check for Format Type")
    @Test
    public  void checkFormatType() {
        Assertions.assertEquals(splitMessage.inputMessage.getFormatType(),"U");
    }

    @DisplayName("Check for Currency")
    @Test
    public  void checkCurrency() {
        Assertions.assertEquals(splitMessage.inputMessage.getCurrency().trim().length(),3);
    }

    @DisplayName("Check for Service")
    @Test
    public  void checkService() {
        Assertions.assertEquals(splitMessage.inputMessage.getService().trim().length(),3);
    }

    @DisplayName("Check for Source Country Code")
    @Test
    public  void checkSourceCountryCode() {
        Assertions.assertEquals(splitMessage.inputMessage.getSourceCountryCode().trim().length(),2);
    }

}
