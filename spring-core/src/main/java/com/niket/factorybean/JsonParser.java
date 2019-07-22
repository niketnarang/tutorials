package com.niket.factorybean;

public class JsonParser implements Parser {
    @Override
    public void parse(String string) {
        System.out.println("JSON Parser:: " + string);
    }
}
