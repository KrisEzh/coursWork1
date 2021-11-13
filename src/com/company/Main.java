package com.company;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static Employee employee;

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

        addNewEmployee(employees, one);
        addNewEmployee(employees, two);
        addNewEmployee(employees, three);
        addNewEmployee(employees, four);
        addNewEmployee(employees, five);
        addNewEmployee(employees, six);
        addNewEmployee(employees, seven);
        addNewEmployee(employees, eight);
        addNewEmployee(employees, nine);
        addNewEmployee(employees, ten);

        System.out.println("Employees");
        printEmployee(employee);

        String nameMaxSalary = getMaxSalary().getFullName();
        System.out.println("Сотрудник с максимальной зарплатой : " + nameMaxSalary);

        String nameMinSalary = getMinSalary().getFullName();
        System.out.println("Сотрудник с минимальной зарплатой : " + nameMinSalary);

        System.out.println("Общая сумма затрат на зарплаты: " + salarySum());
        System.out.println("Среднее значение зарплат: " + middleSalary());

        System.out.println("Все имена сотрудников : ");
                printFullName();

    }

    private static boolean addNewEmployee(Employee[] employees, Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            {
                if (employees[i] == null) {
                    employees[i] = employee;
                    return true;
                }
            }
        }
        return false;
    }

    private static void printEmployee(Employee employee) {System.out.println(employee);}

    private static int salarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static int middleSalary() {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        int middleSum = (int) (salarySum / (double) 10);
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













