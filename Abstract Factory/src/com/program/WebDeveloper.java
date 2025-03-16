package com.program;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 100;
    }

    @Override
    public String name() {
        System.out.println("Web Developer");
        return "Web Developer";
    }
}
