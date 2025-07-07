class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;
    Student(int rollNumber, String name, int age, String grade) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.next = null;
    }
    }
    
    class StudentLinkedList {
    Student head;
    
    void addAtBeginning(int roll, String name, int age, String grade) {
    Student newStudent = new Student(roll, name, age, grade);
    newStudent.next = head;
    head = newStudent;
    }
    
    void addAtEnd(int roll, String name, int age, String grade) {
    Student newStudent = new Student(roll, name, age, grade);
    if (head == null) {
    head = newStudent;
    return;
    }
    Student temp = head;
    while (temp.next != null) {
    temp = temp.next;
    }
    temp.next = newStudent;
    }
    
    void addAtPosition(int pos, int roll, String name, int age, String grade) {
    if (pos <= 0) return;
    Student newStudent = new Student(roll, name, age, grade);
    if (pos == 1) {
    newStudent.next = head;
    head = newStudent;
    return;
    }
    Student temp = head;
    for (int i = 1; temp != null && i < pos - 1; i++) {
    temp = temp.next;
    }
    if (temp == null) return;
    newStudent.next = temp.next;
    temp.next = newStudent;
    }
    
    void deleteByRollNumber(int roll) {
    if (head == null) return;
    if (head.rollNumber == roll) {
    head = head.next;
    return;
    }
    Student temp = head;
    while (temp.next != null && temp.next.rollNumber != roll) {
    temp = temp.next;
    }
    if (temp.next == null) return;
    temp.next = temp.next.next;
    }
    
    Student searchByRollNumber(int roll) {
    Student temp = head;
    while (temp != null) {
    if (temp.rollNumber == roll) return temp;
    temp = temp.next;
    }
    return null;
    }
    
    void updateGrade(int roll, String newGrade) {
    Student student = searchByRollNumber(roll);
    if (student != null) student.grade = newGrade;
    }
    
    void displayAll() {
    Student temp = head;
    while (temp != null) {
    System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
    temp = temp.next;
    }
    }
    }
    
    public class StudentRecord {
    public static void main(String[] args) {
    StudentLinkedList list = new StudentLinkedList();
    list.addAtBeginning(1, "Alice", 20, "A");
    list.addAtEnd(2, "Bob", 21, "B");
    list.addAtPosition(2, 3, "Charlie", 22, "C");
    list.displayAll();
    System.out.println("After deleting roll number 2:");
    list.deleteByRollNumber(2);
    list.displayAll();
    System.out.println("Searching for roll number 3:");
    Student s = list.searchByRollNumber(3);
    if (s != null) System.out.println("Found: " + s.name);
    System.out.println("Updating grade of roll 3:");
    list.updateGrade(3, "A+");
    list.displayAll();
    }
    }
    