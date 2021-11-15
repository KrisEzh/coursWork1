package com.company;

import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static Employee employee;

    public static void main(String[] args) {

        addNewEmployee(new Employee("Иванов Иван Иванович", 1, 80_000));
        addNewEmployee(new Employee("Петров Петр Петрович", 2, 85_000));
        addNewEmployee(new Employee("Сергеев Сергей Сергеевич", 3, 60_000));
        addNewEmployee(new Employee("Александров Александр Александрович", 4, 75_000));
        addNewEmployee(new Employee("Алексеев Алексей Алексеевич", 5, 45_000));
        addNewEmployee(new Employee("Романов Роман Романович", 1, 30_000));
        addNewEmployee(new Employee("Георгиев Георгий Георгиевич", 2, 95_000));
        addNewEmployee(new Employee("Евгеньев Евгений Евгеньевич", 3, 25_000));
        addNewEmployee(new Employee("Миронов Мирон Миронович", 4, 40_000));
        addNewEmployee(new Employee("Гордеев Гордей Гордеевич", 5, 50_000));

        System.out.println("Employees");
        for(Employee employee:employees) {
            if(employee != null) {
                printEmployee(employee);
            }
        }

        String nameMaxSalary = getMaxSalary().getFullName();
        System.out.println("Сотрудник с максимальной зарплатой : " + nameMaxSalary);

        String nameMinSalary = getMinSalary().getFullName();
        System.out.println("Сотрудник с минимальной зарплатой : " + nameMinSalary);

        System.out.println("Общая сумма затрат на зарплаты: " + salarySum());
        System.out.println("Среднее значение зарплат: " + middleSalary());

        System.out.println("Все имена сотрудников : ");
                printFullName();

    }

    private static boolean addNewEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            {
                if (Main.employees[i] == null) {
                    Main.employees[i] = employee;
                    return true;
                }
            }
        }
        return false;
    }

    private static void printEmployee(Employee employee) { System.out.println(employee); }

    private static int salarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static int middleSalary() {
        int salarySum = salarySum();
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        int middleSum = (int) (salarySum() / (double) 10);
        return middleSum;
    }

    private static Employee getMaxSalary() {
        float maxSalary = 0;
        Employee nameMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                nameMaxSalary = employees[i];
            }
        }
        return nameMaxSalary;
    }

    private static Employee getMinSalary() {
        float minSalary = employees[0].getSalary();
        Employee nameMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                nameMinSalary = employees[i];
            }
        }
        return nameMinSalary;
    }

   public static void printFullName() {
        for (Employee employee : employees) {
            if (employee != null)
                System.out.println(employee.getFullName());
        }
    }

}













