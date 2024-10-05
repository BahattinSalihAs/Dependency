package org.example;

public class Student {
    private String name;
    private String surname;
    private String idNo;
    private int note;

    public Student(String name, String surname, String idNo, int note) {
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
