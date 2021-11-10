package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.company.Employee.getCount;

public class Main {



    public static void main(String[] args) {

        Employee one = new Employee("Иванов Иван Иванович", 1, 80_000, getCount());
        Employee two = new Employee("Петров Петр Петрович", 2, 85_000, getCount());
        Employee three = new Employee("Сергеев Сергей Сергеевич", 3, 60_000, getCount());
        Employee four = new Employee("Александров Александр Александрович", 4, 75_000, getCount());
        Employee five = new Employee("Алексеев Алексей Алексеевич", 5, 45_000, getCount());
        Employee six = new Employee("Романов Роман Романович", 6, 30_000, getCount());
        Employee seven = new Employee("Георгиев Георгий Георгиевич", 7, 100_000, getCount());
        Employee eight = new Employee("Евгеньев Евгений Евгеньевич", 8, 25_000, getCount());
        Employee nine = new Employee("Миронов Мирон Миронович", 9, 40_000, getCount());
        Employee ten = new Employee("Гордеев Гордей Гордеевич", 10, 50_000, getCount());

        Employee[] person = new Employee[10];
        addNewEmployee(person, one);
        addNewEmployee(person, two);
        addNewEmployee(person, three);
        addNewEmployee(person, four);
        addNewEmployee(person, five);
        addNewEmployee(person, six);
        addNewEmployee(person, seven);
        addNewEmployee(person, eight);
        addNewEmployee(person, nine);
        addNewEmployee(person, ten);

        // person[0] = new Employee("Иванов Иван Иванович", 1, 80_000, getCount());
        //person[1] = new Employee("Петров Петр Петрович", 2, 85_000, getCount());
        //person[2] = new Employee("Сергеев Сергей Сергеевич", 3, 60_000, getCount());
        //person[3] = new Employee("Александров Александр Александрович", 4, 75_000, getCount());
       // person[4] = new Employee("Алексеев Алексей Алексеевич", 5, 45_000, getCount());

        System.out.println("Employees");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
        System.out.println(ten);

        List<Employee> salaries = Arrays.asList(one,two, three, four, five, six, seven, eight, nine ,ten);

        Employee min = salaries.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getSalary))).get();
        System.out.println("Employee with min salary : " + min );

        Employee max = salaries.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))).get();
        System.out.println("Employee with max salary : " + max);

    //    for (int i = 0; i < person.length; i++) {
      //      System.out.println(employee.getFullName());
        //}



        System.out.println(salarySum(person));
    }

    public static Employee[] addNewEmployee(Employee[] person, Employee employee) {
        for (int i = 0; i < person.length; i++) {
            if (person[i] == null)
                person[i] = employee;
            break;
        } return person; }

    public static int salarySum(Employee[]person) {
        int sum = 0;
        for(Employee employee : person) {
            sum += employee.getSalary();
        }
        return sum;
    }


}









