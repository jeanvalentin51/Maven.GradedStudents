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
        int positionToAddStudent = 0;

        for (int i = 0; i < this.allStudents.length; i++){
            if (this.allStudents[i] == null) {
                positionToAddStudent = i;
                break;
            }
        }
        this.allStudents[positionToAddStudent] = newStudent;

    }

    public void removeStudent (String firstName, String lastName){

        int lastStudentIndex = allStudents.length - 1;
        int indexStudentToBeRemoved = 0;

        for (int i = 0; i < allStudents.length; i++){
            if (allStudents[i].getFirstName().equals(firstName) && allStudents[i].getLastName().equals(lastName)){
                indexStudentToBeRemoved = i;
            }
        }

        for (int i = indexStudentToBeRemoved; i < allStudents.length; i ++){
            if (i!= allStudents.length - 1) allStudents[i] = allStudents[i+1];
        }

        allStudents[lastStudentIndex] = null;
    }

    public Student [] getStudentsByScore(){
        double studentOneAverageScore = 0.0;
        double studentTwoAverageScore = 0.0;
        Student tempPosition;
        //TODO add lexigraphical sorting
        for (int i = 0; i < allStudents.length; i++){
            if (allStudents.length > 1){
                for (int k = i; k < allStudents.length ; k++){
                    studentOneAverageScore = allStudents[i].getAverageExamScores();
                    studentTwoAverageScore = allStudents[k].getAverageExamScores();
                    if ( studentOneAverageScore > studentTwoAverageScore){
                        tempPosition = allStudents[i];
                        allStudents[i] = allStudents[k];
                        allStudents[k] = tempPosition;
                    }
                }
            }
        }
        return allStudents;
    }

    public  void getGradeBook (){
        double meanScore = getAverageExamScore();


    }

}

