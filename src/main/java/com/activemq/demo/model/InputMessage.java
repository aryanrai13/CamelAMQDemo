package com.activemq.demo.model;

public class InputMessage {
    private String requestType;
    private String trn;
    private String name;
    private String formatType;
    private Float  amount;
    private String currency;
    private String service;
    private String sourceCountryCode;
    private String mainMessage20;
    private String mainMessage32A;
    private String getMainMessage36;


    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getTrn() {
        return trn;
    }

    public void setTrn(String trn) {
        this.trn = trn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSourceCountryCode() {
        return sourceCountryCode;
    }

    public void setSourceCountryCode(String sourceCountryCode) {
        this.sourceCountryCode = sourceCountryCode;
    }

    public String getMainMessage20() {
        return mainMessage20;
    }

    public void setMainMessage20(String mainMessage20) {
        this.mainMessage20 = mainMessage20;
    }

    public String getMainMessage32A() {
        return mainMessage32A;
    }

    public void setMainMessage32A(String mainMessage32A) {
        this.mainMessage32A = mainMessage32A;
    }

    public String getGetMainMessage36() {
        return getMainMessage36;
    }

    public void setGetMainMessage36(String getMainMessage36) {
        this.getMainMessage36 = getMainMessage36;
    }
}
