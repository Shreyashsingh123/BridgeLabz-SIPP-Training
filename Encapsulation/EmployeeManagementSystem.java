public class EmployeeManagementSystem {
    public static void main(String[] args) {
    Employee[] employees = new Employee[2];
    FullTimeEmployee fte = new FullTimeEmployee(101, "Amit", 60000);
    fte.assignDepartment("Engineering");
    PartTimeEmployee pte = new PartTimeEmployee(102, "Sneha", 0, 80, 500);
    pte.assignDepartment("Support");
    employees[0] = fte;
    employees[1] = pte;
    for (Employee e : employees) {
    e.displayDetails();
    if (e instanceof Department) {
    System.out.println(((Department) e).getDepartmentDetails());
    }
    System.out.println("");
    }
    }
    }
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
    }
    
    abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    Employee(int employeeId, String name, double baseSalary) {
    this.employeeId = employeeId;
    this.name = name;
    this.baseSalary = baseSalary;
    }
    public int getEmployeeId() {
    return employeeId;
    }
    public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public double getBaseSalary() {
    return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();
    public void displayDetails() {
    System.out.println("ID: " + employeeId);
    System.out.println("Name: " + name);
    System.out.println("Base Salary: ₹" + baseSalary);
    System.out.println("Total Salary: ₹" + calculateSalary());
    }
    }
    
    class FullTimeEmployee extends Employee implements Department {
    private String department;
    FullTimeEmployee(int employeeId, String name, double baseSalary) {
    super(employeeId, name, baseSalary);
    }
    public double calculateSalary() {
    return getBaseSalary();
    }
    public void assignDepartment(String dept) {
    this.department = dept;
    }
    public String getDepartmentDetails() {
    return "Department: " + department;
    }
    }
    
    class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;
    PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
    super(employeeId, name, baseSalary);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
    }
    public double calculateSalary() {
    return hoursWorked * hourlyRate;
    }
    public void assignDepartment(String dept) {
    this.department = dept;
    }
    public String getDepartmentDetails() {
    return "Department: " + department;
    }
    }
    
    
    