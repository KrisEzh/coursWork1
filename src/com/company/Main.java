package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.company.Employee.getCount;

public class Main {
    private static Employee employee;
    Employee[] person;

    public Main(Employee[] person) {
        this.person = person;
    }

    public static void main(String[] args) {

        Employee one = new Employee("Иванов Иван Иванович", 1, 80_000, getCount());
        Employee two = new Employee("Петров Петр Петрович", 2, 85_000, getCount());
        Employee three = new Employee("Сергеев Сергей Сергеевич", 3, 60_000, getCount());
        Employee four = new Employee("Александров Александр Александрович", 4, 75_000, getCount());
        Employee five = new Employee("Алексеев Алексей Алексеевич", 5, 45_000, getCount());
        Employee six = new Employee("Романов Роман Романович", 1, 30_000, getCount());
        Employee seven = new Employee("Георгиев Георгий Георгиевич", 2, 95_000, getCount());
        Employee eight = new Employee("Евгеньев Евгений Евгеньевич", 3, 25_000, getCount());
        Employee nine = new Employee("Миронов Мирон Миронович", 4, 40_000, getCount());
        Employee ten = new Employee("Гордеев Гордей Гордеевич", 5, 50_000, getCount());

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

        String nameMaxSalary = getMaxSalary(person).getFullName();
        System.out.println("Сотрудник с максимальной зарплатой : " + nameMaxSalary);

        String nameMinSalary = getMinSalary(person).getFullName();
        System.out.println("Сотрудник с минимальной зарплатой : " + nameMinSalary);

        System.out.println("Общая сумма затрат на зарплаты: " + salarySum(person));
        System.out.println("Среднее значение зарплат: " + middleSalary(person));

        for (Employee employee : person) {
            if (employee != null) {
                printFullName(employee);
            }
        }
        System.out.println("Индексация зарплат на 1.05% для каждого сотрудника: ");
        one.setSalary((int) (one.getSalary() * 1.05));
        System.out.println(one.getSalary());
        two.setSalary((int) (two.getSalary() * 1.05));
        System.out.println(two.getSalary());
        three.setSalary((int) (three.getSalary() * 1.05));
        System.out.println(three.getSalary());
        four.setSalary((int) (four.getSalary() * 1.05));
        System.out.println(four.getSalary());
        five.setSalary((int) (five.getSalary() * 1.05));
        System.out.println(five.getSalary());
        six.setSalary((int) (six.getSalary() * 1.05));
        System.out.println(six.getSalary());
        seven.setSalary((int) (seven.getSalary() * 1.05));
        System.out.println(seven.getSalary());
        eight.setSalary((int) (eight.getSalary() * 1.05));
        System.out.println(eight.getSalary());
        nine.setSalary((int) (nine.getSalary() * 1.05));
        System.out.println(nine.getSalary());
        ten.setSalary((int) (ten.getSalary() * 1.05));
        System.out.println(ten.getSalary());

    //    minAndMaxSalaryInDepartment(1);


    }

    public static boolean addNewEmployee(Employee[] person, Employee employee) {
        for (int i = 0; i < person.length; i++) {
            {
                if (person[i] == null) {
                    person[i] = employee;
                    return true;
                }
            }
        }
        return false;
    }

    public static int salarySum(Employee[] person) {
        int sum = 0;
        for (Employee employee : person) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int middleSalary(Employee[] person) {
        int sum = 0;
        for (Employee employee : person) {
            sum += employee.getSalary();
        }
        int middleSum = (int) (sum / (double) 10);
        return middleSum;
    }
    public static Employee getMaxSalary(Employee[]person) {
        float maxSalary = 0;
        Employee nameMaxSalary = person[0];
        for(int i = 0; i<person.length; i++) {
            if(person[i].getSalary()>maxSalary) {
                maxSalary = person[i].getSalary();
                nameMaxSalary = person[i];
            }
        }
        return nameMaxSalary;
    }
    public static Employee getMinSalary(Employee[]person) {
        float minSalary = person[0].getSalary();
        Employee nameMinSalary = person[0];
        for (int i = 0; i < person.length; i++) {
            if(person[i].getSalary()<minSalary) {
                minSalary = person[i].getSalary();
                nameMinSalary = person[i];
            }

        }
        return nameMinSalary;
    }

    public static void printFullName(Employee employee) {
        System.out.println(employee.getFullName());
    }

   // private static Employee[] person;

    //public void departmentNumber(int departamentNum, Employee[] person) {
      //  this.person = new Employee[departamentNum];
    //}

    //public static void minAndMaxSalaryInDepartment(int departmentNum) {
        //Employee[] person= new Employee[employee.getSalary()];
       // Employee minSalary= person[0];
        //for (int i = 0; i < person.length; i++) {
          //  Employee value = person[i];
  //          {if(employee.getDepartmentNum() == (departmentNum) && employee.getSalary() >  person)
    //             minSalary = value; }
      //      System.out.println(minSalary);
        //    } }

    }













