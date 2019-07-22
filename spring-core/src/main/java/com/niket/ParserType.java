package com.niket;

public enum ParserType {
    XML("xmlParser"), JSON("jsonParser");

    private final String value;

    ParserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
