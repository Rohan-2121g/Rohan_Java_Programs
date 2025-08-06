package com.rohan;

// task 1 day 5
class Employee {
    private String name;
    private int ID;
    private long salary;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
}


public class TASK_9_Kaamgaar_id {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("Rooney");
        obj.setID(69);
        obj.setSalary(550);

        System.out.println("Name: " + obj.getName() +
                           " ID: " + obj.getID() +
                           " Salary: " + obj.getSalary());
    }
}