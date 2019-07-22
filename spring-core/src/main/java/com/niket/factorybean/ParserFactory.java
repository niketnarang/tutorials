package com.niket.factorybean;

public interface ParserFactory {
    Parser getParser(ParserType parserType);
}
