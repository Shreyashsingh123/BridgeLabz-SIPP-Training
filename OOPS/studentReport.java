public class studentReport {
        public static void main(String[] args) {
            Student student1 = new Student("ram", 10, 75);
            Student student2 = new Student("Ankit", 19, 88);
            Student student3 = new Student("Rishabh", 35, 55);
    
            student1.displayDetails();
            student2.displayDetails();
            student3.displayDetails();
        }
    }
    
    class Student {
        String name;
        int rollNumber;
        int marks;
    
        Student(String name, int rollNumber, int marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }
    
        String grade() {
            if (marks >= 90) return "A+";
            else if (marks >= 80) return "A";
            else if (marks >= 70) return "B";
            else if (marks >= 60) return "C";
            else if (marks >= 50) return "D";
            else return "Fail";
        }
    
        void displayDetails() {
            System.out.println("Name of student is : " + name);
            System.out.println("Roll Number is : " + rollNumber);
            System.out.println("Marks is : " + marks);
            System.out.println("Grade obtained is : " + grade());
            System.out.println("");
        }
    }
