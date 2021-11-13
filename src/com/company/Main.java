package com.company;

public class Main {
    Employee[] person;
    static Employee employee;
    public static void main(String[] args) {


        Employee one = new Employee("Иванов Иван Иванович", 1, 80_000);
        Employee two = new Employee("Петров Петр Петрович", 2, 85_000);
        Employee three = new Employee("Сергеев Сергей Сергеевич", 3, 60_000);
        Employee four = new Employee("Александров Александр Александрович", 4, 75_000);
        Employee five = new Employee("Алексеев Алексей Алексеевич", 5, 45_000);
        Employee six = new Employee("Романов Роман Романович", 1, 30_000);
        Employee seven = new Employee("Георгиев Георгий Георгиевич", 2, 95_000);
        Employee eight = new Employee("Евгеньев Евгений Евгеньевич", 3, 25_000);
        Employee nine = new Employee("Миронов Мирон Миронович", 4, 40_000);
        Employee ten = new Employee("Гордеев Гордей Гордеевич", 5, 50_000);

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
        printEmployee(employee);

        String nameMaxSalary = getMaxSalary(person).getFullName();
        System.out.println("Сотрудник с максимальной зарплатой : " + nameMaxSalary);

        String nameMinSalary = getMinSalary(person).getFullName();
        System.out.println("Сотрудник с минимальной зарплатой : " + nameMinSalary);

        System.out.println("Общая сумма затрат на зарплаты: " + salarySum(person));
        System.out.println("Среднее значение зарплат: " + middleSalary(person));

        System.out.println("Все имена сотрудников : ");
                printFullName(person);

    }

    private static boolean addNewEmployee(Employee[] person, Employee employee) {
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

    private static void printEmployee(Employee employee) {System.out.println(employee);}

    private static int salarySum(Employee[] person) {
        int sum = 0;
        for (Employee employee : person) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static int middleSalary(Employee[] person) {
        int salarySum = 0;
        for (Employee employee : person) {
            salarySum += employee.getSalary();
        }
        int middleSum = (int) (salarySum / (double) 10);
        return middleSum;
    }

    private static Employee getMaxSalary(Employee[] person) {
        float maxSalary = 0;
        Employee nameMaxSalary = person[0];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSalary() > maxSalary) {
                maxSalary = person[i].getSalary();
                nameMaxSalary = person[i];
            }
        }
        return nameMaxSalary;
    }

    private static Employee getMinSalary(Employee[] person) {
        float minSalary = person[0].getSalary();
        Employee nameMinSalary = person[0];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSalary() < minSalary) {
                minSalary = person[i].getSalary();
                nameMinSalary = person[i];
            }
        }
        return nameMinSalary;
    }

   public static void printFullName(Employee[]person) {
        for (Employee employee : person) {
            if (employee != null)
                System.out.println(employee.getFullName());
        }
    }
}













