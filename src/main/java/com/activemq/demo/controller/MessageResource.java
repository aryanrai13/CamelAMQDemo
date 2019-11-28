package com.activemq.demo.controller;


import com.activemq.demo.model.InputMessage;
import com.activemq.demo.model.InputServiceMessage;
import com.activemq.demo.model.ServiceMessage;
import org.springframework.web.bind.annotation.*;


@RestController
public class MessageResource {

    @PostMapping(value = "/log/message", consumes = "application/json", produces = "application/json")
    public ServiceMessage  getMessage(@RequestBody InputServiceMessage inputServiceMessage) {
        System.out.println(inputServiceMessage.getRestInputMessage());
        ServiceMessage serviceMessage = new ServiceMessage("Got it.Thanks");
                return  serviceMessage;
    }

}
