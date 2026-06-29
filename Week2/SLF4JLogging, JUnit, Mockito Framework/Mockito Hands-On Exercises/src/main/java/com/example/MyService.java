package com.example;

public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }

    public String fetchDataWithArg(String arg) {
        return externalApi.getDataWithArg(arg);
    }

    public void performAction() {
        externalApi.doSomething();
    }

    public void performActionWithArg(String arg) {
        externalApi.doSomethingWithArg(arg);
    }
}
