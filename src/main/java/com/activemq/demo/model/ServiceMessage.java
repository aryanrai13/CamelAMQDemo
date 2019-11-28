package com.activemq.demo.model;

public class ServiceMessage {
    private String outputMessage;

    public ServiceMessage() {
    }

    public ServiceMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }
}
