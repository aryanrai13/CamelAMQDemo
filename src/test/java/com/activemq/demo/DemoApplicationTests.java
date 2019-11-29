package com.activemq.demo;

import com.activemq.demo.util.SplitMessage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	String message = "GZXFRTJ675FTRHJJJ87zyxtBig Kumar           U000000000000017.450EURATZAT";
	SplitMessage splitMessage = new SplitMessage(message);

	@DisplayName("Check for Input Message Length")
	@Test
	public  void checkMessage() {
		Assertions.assertEquals(71,splitMessage.inputString.length());
	}

	@DisplayName("Check for TRN")
	@Test
	public  void checkTrn() {
		Assertions.assertEquals(22,splitMessage.inputMessage.getTrn().trim().length());
	}

	@DisplayName("Check for Format Type")
	@Test
	public  void checkFormatType() {
		Assertions.assertEquals("U",splitMessage.inputMessage.getFormatType());
	}

	@DisplayName("Check for Currency")
	@Test
	public  void checkCurrency() {
		Assertions.assertEquals(3,splitMessage.inputMessage.getCurrency().trim().length());
	}

	@DisplayName("Check for Service")
	@Test
	public  void checkService() {
		Assertions.assertEquals(3,splitMessage.inputMessage.getService().trim().length());
	}

	@DisplayName("Check for Source Country Code")
	@Test
	public  void checkSourceCountryCode() {
		Assertions.assertEquals(2,splitMessage.inputMessage.getSourceCountryCode().trim().length());
	}



}