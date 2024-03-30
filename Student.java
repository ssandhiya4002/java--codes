class Student {
    String name;
   int marks;
    char grade;
 
    Student(String name, int marks) {
         this.name = name;
         this.marks = marks;
         calculateGrade(); 
     }
 void calculateGrade() {
         if (marks >= 90) {
             grade = 'A';
         } else if (marks >= 80) {
             grade = 'B';
         } else if (marks >= 70) {
             grade = 'C';
         } else if (marks >= 60) {
             grade = 'D';
         } else {
             grade = 'F';
         }
     }
 
    void displayDetails() {
         System.out.println("Student Name: " + name);
         System.out.println("Marks: " + marks);
         System.out.println("Grade: " + grade);
     }
   public static void main(String[] args) {
         Student student1 = new Student("Alice", 85);
         student1.displayDetails();
 
         Student student2 = new Student("Bob", 72);
         student2.displayDetails();
     }
 }
 