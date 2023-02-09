package org.example.objectCopying;

public class Employee implements Cloneable{
    private int empId;
    private String empName;
    //Normal constructor
    Employee(int id,String name){
        this.empId = id;
        this.empName = name;
    }
    //copy constructor
    Employee(Employee employee){
        this.empId = employee.empId;
        this.empName = employee.empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
