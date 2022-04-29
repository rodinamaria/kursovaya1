package com.company;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivan", "Ivanov", 10_000, 1);
        System.out.println(calculateTotalSalary());

    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.getSalary();
            }

        }
        return result;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (result == null || employee.getSalary() < result.getSalary()) {
                    result = employee;
                }
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (result == null || employee.getSalary() > result.getSalary()) {
                    result = employee;
                }
            }
        }
        return result;
    }

    public static double calculateAvgSalary() {
        int count = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return calculateTotalSalary() / count;
    }

    public static void ptintName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
