package com.niket.factorybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParserService {

    @Autowired
    private ParserFactory parserFactory;

    public void doParse(String parseString, ParserType parserType) {
        Parser parser = parserFactory.getParser(parserType);
        parser.parse(parseString);
    }
}
