package com.company;


import java.util.List;

public class Employee {

    private String fullName;
    private int departmentNum;
    private int salary;
    private static int count=1;
    private static int id;

    public Employee(String fullName, int departmentNum, int salary, int count) {
        this.fullName = fullName;
        this.departmentNum = departmentNum;
        this.salary = salary;
        this.count = count;
    }

    public static int getCount()
        {id = count;
            return count++;
        }


    public String getFullName() {
        return fullName;
    }

    public  int getDepartmentNum() {
        return departmentNum;
    }
    public  int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    public void setDepartmentNum(int departmentNum){
        this.departmentNum=departmentNum;
    }

    @Override
    public String toString() {
        return "Employee" +
                " id " + getCount() +
                ", fullName " + getFullName() +
                ", dep.number " + getDepartmentNum() +
                ", salary " +  getSalary();
    }



}
