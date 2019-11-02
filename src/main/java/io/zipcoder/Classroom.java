package io.zipcoder;

import java.util.Arrays;

public class Classroom {
    Student [] allStudents;



    public Classroom (Student[] students){
        this.allStudents = students;
    }


    public Classroom (int maxNumberOfStudents){
        this.allStudents = new Student[maxNumberOfStudents];
    }

    public Classroom(){
        this.allStudents = new Student[30];
    }

    public Student [] getStudents (){
        return this.allStudents;
    }

    public double getAverageExamScore(){
        double examScores = 0;

        for (int i = 0; i < this.allStudents.length; i++){
            for (int k = 0; k < this.allStudents[i].testScores.size(); k++){
                examScores += this.allStudents[i].testScores.get(k);
            }
        }

        return examScores/this.allStudents.length;
    }

    public void addStudent (Student newStudent){
        this.allStudents[this.allStudents.length - 1] = newStudent;
    }

}

