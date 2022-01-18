package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student("Eddy",1, 12, 4.0);
        System.out.println("The name: " + student1.getName());
        System.out.println("The student ID: " + student1.getStudentId());
        System.out.println("The number of credits: " + student1.getNumberOfCredits());
        System.out.println("The GPA: " + student1.getGpa());
    }
}
