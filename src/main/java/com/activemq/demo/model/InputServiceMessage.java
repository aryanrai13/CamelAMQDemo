package com.activemq.demo.model;

public class InputServiceMessage {
    private String restInputMessage;

    public InputServiceMessage() {
    }

    public InputServiceMessage(String restInputMessage) {
        this.restInputMessage = restInputMessage;
    }

    public String getRestInputMessage() {
        return restInputMessage;
    }

    public void setRestInputMessage(String restInputMessage) {
        this.restInputMessage = restInputMessage;
    }
}
