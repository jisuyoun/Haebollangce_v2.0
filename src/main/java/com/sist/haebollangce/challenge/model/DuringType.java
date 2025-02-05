package com.sist.haebollangce.challenge.model;

public enum DuringType {
    WEEK1("1"),
    WEEK2("2"),
    WEEK3("3"),
    WEEK4("4"),
    WEEK5("5"),
    WEEK6("6"),
    WEEK7("7"),
    WEEK8("8");
    
    private final String weekType;
    
    DuringType(String weekType) {
        this.weekType = weekType;
    }
    
    public String getWeekType() {
        return weekType;
    }
}
