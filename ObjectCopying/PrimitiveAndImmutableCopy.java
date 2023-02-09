package org.example.objectCopying;

public class PrimitiveAndImmutableCopy {

    //Shallow copy
    public static void shallowCopy(Employee employee){
        Employee employee4 = employee;
        System.out.println("Before performing shallow copy, the original employee object is : ");
        System.out.println("Employee id: "+employee.getEmpId()+" Employee name: "+employee.getEmpName());
        //op: Employee id: 100 Employee name: Anuj
        employee4.setEmpId(103);
        employee4.setEmpName("Shallow");
        System.out.println("Employee4 id: "+employee4.getEmpId()+" Employee4 name: "+employee4.getEmpName());
        //op: Employee4 id: 103 Employee4 name: Shallow
        System.out.println("After performing shallow copy, the original employee object became like:");
        System.out.println("Employee id: "+employee.getEmpId()+" Employee name: "+employee.getEmpName());
        //op: Employee id: 103 Employee name: Shallow
    }

    //Cloning using clone method (deep copy)
    public static void cloneMethodCloning(Employee employee) throws CloneNotSupportedException {
        Employee employee3 = (Employee)employee.clone();
        employee3.setEmpId(103);
        employee3.setEmpName("Clone");
        System.out.println("Employee3 id: "+employee3.getEmpId()+" Employee3 name: "+employee3.getEmpName());
        //op: Employee3 id: 103 Employee3 name: Clone
        //Original employee Object
        System.out.println("Employee id: "+employee.getEmpId()+" Employee name: "+employee.getEmpName());
        //op: Employee id: 100 Employee name: Anuj
    }

    //Cloning using copy constructor (deep copy)
    public static void copyConstructorCloning(Employee employee){
        Employee employee2 = new Employee(employee);
        employee2.setEmpId(102);
        employee2.setEmpName("rolex");
        System.out.println("Employee2 id: "+employee2.getEmpId()+" Employee2 name: "+employee2.getEmpName());
        //op: Employee2 id: 102 Employee2 name: rolex
        //Original employee Object
        System.out.println("Employee id: "+employee.getEmpId()+" Employee name: "+employee.getEmpName());
        //op: Employee id: 100 Employee name: Anuj
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee(100,"Anuj");
        System.out.println("Employee id: "+employee.getEmpId()+" Employee name: "+employee.getEmpName());
        //op: Employee id: 100 Employee name: Anuj
        //Cloning using copy constructor (deep copy)
        copyConstructorCloning(employee);
        //Cloning using clone method
        cloneMethodCloning(employee);
        //shallow copy
        shallowCopy(employee);

    }
}
