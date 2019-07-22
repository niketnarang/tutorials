package com.niket.factorybean;

public class CSVParser implements Parser {
    @Override
    public void parse(String string) {
        System.out.println("CSV Parser::" + string);
    }
}
