package com.activemq.demo.util;

import com.activemq.demo.model.InputMessage;


import java.util.ArrayList;
import java.util.List;


public class SplitMessage {

    private boolean nameCheck;
    private boolean souceCountryCodeCheck;
    private boolean serviceCheck;
    private boolean mainMessageCheck;

    public String  inputString;
    List<String> names = new ArrayList<>();
    public InputMessage inputMessage = new InputMessage();

    public SplitMessage(String message) {
        this.inputString = message;
        inputMessage.setRequestType(inputString.substring(0,1));
        inputMessage.setTrn(inputString.substring(1,23));
        inputMessage.setName(inputString.substring(23,43));
        inputMessage.setFormatType(inputString.substring(43,44));
        inputMessage.setCurrency(inputString.substring(63,66));
        inputMessage.setService(inputString.substring(66,69));
        inputMessage.setSourceCountryCode(inputString.substring(69,71));

    }

    public String validateAndPrepareMessage() {
        names.add("Mark Imaginary");
        names.add("Govind Real");
        names.add("Shakil Maybe");
        names.add("Big Kumar");

         String[] tokens = inputString.split(":32A:");
         Integer count = 1;


        for (String name : names) {
            if (name.equals(inputMessage.getName().trim())) {
             //   System.out.println("Names Match");
                nameCheck = true;
            }
            /*
            else
                System.out.println("Names " + name + " and " + inputMessage.getName() + "Dont Match"); */
        }

        if (inputMessage.getSourceCountryCode().trim().equals("AT"))
            souceCountryCodeCheck = true;

        if (inputMessage.getService().trim().equals("ATZ"))
            serviceCheck = true;

        for (String token : tokens)
        {
          //  System.out.println(token);
            if (token.contains("Ship dual FERT chem") && count==2) {
             //   System.out.println("Main message error");
                mainMessageCheck = true;
            }
            count++;
        }

        if (nameCheck && souceCountryCodeCheck && serviceCheck)
            return ("Suspicious Shipment" + "-" + "AT" + "-" + "ATZ" + "-" + inputMessage.getTrn());
        else
            return ("Nothing found, all okay");
    }

}
