package com.program;

public class ManagerFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
