public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1=new Employee("ram",29,56000);
        Employee emp2=new Employee(" Harsh",44,40500);
        System.out.println("first Employee details are");
        emp1.display();
System.out.println("Second Employee Details are  ");
emp2.display();
    }
}
class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
this.name=name;
this.id=id;
this.salary=salary;
    }
    void display(){
        System.out.println("Employee name is :"+ name);
        System.out.println("Employee id is :"+id);
        System.out.println("Employee salary is :"+salary);
    }
}
