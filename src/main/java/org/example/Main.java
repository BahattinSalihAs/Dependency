package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Salih","As","456",85);
        Student s2 = new Student("Tuba","As","798",55);
        Student s3 = new Student("Semra","Subaşı","852",80);

        Instructor teacher = new Instructor("Mustafa","Çetindağ","Matemtaik");

        Course mat = new Course("MAT101","MAT",teacher);
        System.out.println(mat.getInstructor().getName());

        Student[] students = {s1,s2,s3};
        System.out.println(mat.calcAverage(students));

    }
}