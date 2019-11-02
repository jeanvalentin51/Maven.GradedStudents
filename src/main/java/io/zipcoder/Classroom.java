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
            // examScores = examScores + this.allStudents[i].getTestScores();
        }

        return examScores/this.allStudents.length;
    }
}

