package com.capgemini.model;

public class View {
    private String keyValue;
    private String keyName;

    public View(String keyValue, String keyName) {
        this.keyValue = keyValue;
        this.keyName = keyName;
    }

    @Override
    public String toString() {
        return "View{" +
                "keyValue='" + keyValue + '\'' +
                ", keyName='" + keyName + '\'' +
                '}';
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
}