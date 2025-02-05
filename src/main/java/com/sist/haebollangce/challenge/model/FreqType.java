package com.sist.haebollangce.challenge.model;

public enum FreqType {
    DAILY("1"),
    WEEKDAY("2"),
    WEEKEND("3");
    
    private final String freqType;
    
    FreqType(String freqType) {
        this.freqType = freqType;
    }
    
    public String getFreqType() {
        return freqType;
    }
}
