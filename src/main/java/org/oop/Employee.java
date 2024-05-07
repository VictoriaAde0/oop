package org.oop;

public class Employee {
    private String name;
    private int id;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Micheal", 2456, 100000.0);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Salary: #" + employee.getSalary());

        employee.setSalary(100000);
        System.out.println("Updated Employee Salary: $" + employee.getSalary());
    }
}


