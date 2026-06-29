package com.example;

public interface ExternalApi {
    String getData();
    String getDataWithArg(String arg);
    void doSomething();
    void doSomethingWithArg(String arg);
}
