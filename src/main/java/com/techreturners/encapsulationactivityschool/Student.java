package com.techreturners.encapsulationactivityschool;

public class Student {
    private String name;
    private char grade;
    private int group;
    private String secretNickname;

    public Student(String studentName, char studentGrade, int studentGroup) {
        this.name = studentName;
        this.grade = studentGrade;
        this.group = studentGroup;
    }


    public void setName(String studentName) {
        this.name = studentName;
    }

    public String getName() {
        return name;
    }

    //setGrade is private as grade can only be set from the constructor method or from upgrade or downgrade methods
    private void setGrade(char studentGrade) {
        //validate the grade
        if (grade >= 'A' && grade <= 'E') {
            this.grade = studentGrade;
        } else {
            System.out.println("Invalid grade");
        }

    }

    public char getGrade() {
        return grade;
    }

    public void upGrade() {
        this.grade += 1;
        this.setGrade(this.grade);
    }

    public void downGrade() {
        this.grade -= 1;
        this.setGrade(this.grade);
    }

    public void setSecretNickname(String studentNickname) {
        this.secretNickname = studentNickname;
    }

    //no get method to getSecretNickname, as School not allowed to get this


    public void setGroup(int studentGroup) {
        //validate group
        if (group <= 6) {
            this.group = studentGroup;
        } else {
            System.out.println("Invalid group");
        }
    }

    public int getGroup() {
        return this.group;
    }


}
