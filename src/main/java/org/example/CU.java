package org.example;

import java.util.ArrayList;

public class CU  {
    private String nameCU;
    private ArrayList <Mark> marks;
    private int totalStudents;


    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        marks = new ArrayList<Mark>();
    }

    public void insertMarkCU(int numStudent , double mark){
        Mark newMark = new Mark(numStudent,mark);
        if(marks.add(newMark)){
            totalStudents++;
        }
    }

    public double searchStudent(int numStudent){
        for(Mark marks: marks){
            if(marks.getNumStudent() == numStudent){
                return marks.getMark();
            }
        }
        return -1;
    }

    public double averageCU(){
        double total = 0;
        double average = 0;
        int count = 0;
        for(Mark marks:marks){
            total = total + marks.getMark();
            count++;
        }
        average = total/count;
        return average;
    }

    public boolean isApproved(int numStudent){
        double grade = searchStudent(numStudent);
        if(grade >= 9.5){
            return true;
        }
        return false;
    }

}
