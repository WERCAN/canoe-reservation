package com.capgemini.model;

public class Permission {
    private String keyValue;
    private String keyName;

    public Permission(String keyValue, String keyName) {
        this.keyValue = keyValue;
        this.keyName = keyName;
    }

    @Override
    public String toString() {
        return "Permission{" +
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