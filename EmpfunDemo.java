class SuperEmployee
{
    String name;
    int age;
    double sal;
    
    double ann_sal()
    {
        return sal*12;
    }
}
public class EmpfunDemo {
    
    public static void main(String args[]){
        SuperEmployee Employee = new SuperEmployee();
        Employee.name = "Pradipta";
        Employee.age = 38;
        Employee.sal = 35000.50;
        
        double salary;
        salary = Employee.ann_sal();
        
        System.out.println("Name of the employee is :" + Employee.name);
        System.out.println("age of the employee is :" + Employee.age);
        System.out.println("salary of the employee is :" + Employee.sal);
        System.out.println("Annual salary of the employee is :" + salary);
    
    
    }
}