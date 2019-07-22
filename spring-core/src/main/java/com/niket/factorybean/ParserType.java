package com.niket.factorybean;

public enum ParserType {
    XML("xmlParser"), JSON("jsonParser"), CSVParser("csvParser");

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
