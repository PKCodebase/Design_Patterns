package com.program;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 99;
    }

    @Override
    public String name() {
        System.out.println("Android Developer");
        return "Android Developer";
    }
}
