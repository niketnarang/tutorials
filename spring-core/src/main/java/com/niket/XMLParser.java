package com.niket;

public class XMLParser implements Parser {
    @Override
    public void parse(String string) {
        System.out.println("XML Parser:: "+ string);
    }
}
