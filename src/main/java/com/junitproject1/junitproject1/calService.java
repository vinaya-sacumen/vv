package com.junitproject1.junitproject1;

public class calService {
    private AddService addservice;

    public calService(AddService addservice) {
        this.addservice=addservice;
    }



    public  int test()
    {
        int a=addservice.init(1,2);
        return a;
    }
}
