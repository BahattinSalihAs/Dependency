package org.example;

public class Course {
    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double calcAverage(Student[] students){
        double total = 0.0;
        for (Student s: students){
            total += s.getNote();
        }
        return total/ students.length;
    }

}
